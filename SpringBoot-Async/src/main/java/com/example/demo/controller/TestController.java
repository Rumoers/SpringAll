package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzh
 * @description
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestService testService;

    @GetMapping("async")
    public void testAsync() {
        long start = System.currentTimeMillis();
        logger.info("异步方法开始");

        testService.asyncMethod();

        logger.info("异步方法结束");
        long end = System.currentTimeMillis();
        logger.info("总耗时：{} ms", end - start);
    }

    @GetMapping("sync")
    public void testSync() {
        long start = System.currentTimeMillis();
        logger.info("同步方法开始");

        testService.syncMethod();

        logger.info("同步方法结束");
        long end = System.currentTimeMillis();
        logger.info("总耗时：{} ms", end - start);
    }
}