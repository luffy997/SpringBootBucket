package com.dev;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.standard.DateTimeFormatterFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SpringbootScheduleApplicationTests {

    @Test
    public void contextLoads() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mmL:ss z");
        String format = simpleDateFormat.format(new Date());
        System.out.println("第一种：" + format);

        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("第二种：" + now.format(dateTimeFormatter));
    }

    @Test
    public void postMessage() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        //构建请求
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com"); //不要动
        request.setSysVersion("2017-05-25"); //不要动

        request.setSysAction("AddSmsSign");
        //自定义参数 手机号 验证码 签名 模板

        request.putQueryParameter("PhoneNumbers", "手机号");
        request.putQueryParameter("SignName", "手机号");
        request.putQueryParameter("TemplateCode", "模板code");
        //构建短信验证码
        Map<String, Object> map = new HashMap<>();
        map.put("code", 123);
        request.putQueryParameter("TemplateParam", JSONObject.toJSONString(map));
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
