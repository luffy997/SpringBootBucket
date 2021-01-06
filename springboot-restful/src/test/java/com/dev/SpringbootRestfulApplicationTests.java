package com.dev;


import com.dev.mapper.UserMapper;
import com.dev.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


@AutoConfigureMockMvc
@SpringBootTest
class SpringbootRestfulApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //get查一下user列表
//    @Test
//    void getUserController() throws Exception {
//    //测试UserController
//        RequestBuilder request;
//        request = get("/users/");
//        MvcResult result = mvc.perform(request)
//                .andExpect(status().isOk())
//                .andReturn();
//        String content = result.getResponse().getContentAsString();
//        JacksonUtil.json2Bean(content,new TypeReference<BaseResponse<List<User>>>(){});

    // 测试插入
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("狂神说Java");
        user.setAge(3);
        user.setEmail("24736743@qq.com");

        int result = userMapper.insert(user); // 帮我们自动生成id
        System.out.println(result); // 受影响的行数
        System.out.println(user); // 发现，id会自动回填
    }

    //测试乐观锁
    @Test
    public void testversion() {
        User user = userMapper.selectById(1L);
        //修改
        user.setName("最强的");
        user.setAge(11);
        //更新
        userMapper.updateById(user);
    }

    // 测试乐观锁失败！多线程下
    @Test
    public void testOptimisticLocker2(){
        // 线程 1
        User user = userMapper.selectById(1L);
        user.setName("Luffy11111");
        user.setEmail("134@qq.com");

        // 模拟另外一个线程执行了插队操作
        User user2 = userMapper.selectById(1L);
        user2.setName("Luffy22222");
        user2.setEmail("134@qq.com");
        userMapper.updateById(user2);

        // 自旋锁来多次尝试提交！
        userMapper.updateById(user); // 如果没有乐观锁就会覆盖插队线程的值！
    }

}


