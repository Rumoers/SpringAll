package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xzh
 * @description 任务
 */
@Component
public class TestTask {
    private  static  final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    //定义每过3秒执行任务
   // @Scheduled(fixedRate = 3000)
    //每天上午10点，下午2点，4点
    //cron表达式说明https://blog.csdn.net/xzh109/article/details/104004552
    @Scheduled(cron = "0 0 10,14,16 * * ?")
    public void reportCurrentTime(){
        System.out.println("现在时间"+dateFormat.format(new Date()));
    }
}
