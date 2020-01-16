package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xzh
 * @description
 */
@Service
public class TestService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async("asyncThreadPoolTaskExecutor")
    public void asyncMethod() {
        sleep();
        logger.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
    }

    public void syncMethod() {
        sleep();
    }

    private void sleep() {
        try {
            logger.info("睡眠开始");
            TimeUnit.SECONDS.sleep(2);
            logger.info("睡眠结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}