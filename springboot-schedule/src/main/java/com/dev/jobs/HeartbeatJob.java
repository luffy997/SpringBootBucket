package com.dev.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务
 *
 * @author 路飞
 * @create 2021/1/7
 */
@Component
public class HeartbeatJob {
    private static final Logger log = LoggerFactory.getLogger(HeartbeatJob.class);
    private final static long ONE_Minute = 60 * 1000;


//    /**
//     * 检查状态01
//     */
//    @Scheduled
//    public void checkState(){
//        log.info("-------------检查开始");
//        log.info("-------------检查结束");
//    }
//
//    /**
//     * 检查状态02
//     */
//    @Scheduled
//    public void checkState2(){
//        log.info("-------------检查开始2");
//        log.info("-------------检查结束2");
//    }

    @Scheduled(fixedDelay = ONE_Minute)
    public void fixedDelayJob() throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = simpleDateFormat.format(new Date());
        log.info(currentTime + "测试fixedDelay：当任务执行1分钟后再执行下一个任务");
    }

    @Scheduled(fixedRate = ONE_Minute)
    public void fixedRateJob() throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = simpleDateFormat.format(new Date());
        log.info(currentTime + "fixedRate：测试每隔一分钟执行一次");
    }

    /**
     * * 第一位，秒，取值0-59
     * * 第二位，分，取值0-59
     * * 第三位，时，取值0-23
     * * 第四位，日，取值1-31
     * * 第五位，月，取值1-12
     * * 第六位，星期，取值1-7，1表示星期天，2表示星期一
     * * 第七位，年份，可以留空，取值1970-2099
     */
    @Scheduled(cron = "0 20 10 * * ?")
    public void testCornJob() throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = simpleDateFormat.format(new Date());
        log.info(currentTime + "Corn：测试每天10点20分");
    }
}
