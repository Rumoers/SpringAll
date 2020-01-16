package com.example.demo.Async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author xzh
 * @description
 */
@RestController
@RequestMapping("task")
public class DoTask {

    @Autowired
    private TestAsyncTask asyncTask;

    @RequestMapping("testAsync")
    public String execAsyncTask() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> a = asyncTask.doTask1();
        Future<String> b = asyncTask.doTask2();
        Future<String> c = asyncTask.doTask3();

        while (true) {
            if (a.isDone() && b.isDone() && c.isDone()) {
                break;
            }
        }

        long end = System.currentTimeMillis();

        String times = "任务全部完成，总耗时：" + (end - start) + " ms";
        System.out.println(times);
        System.out.println(a);
        return times;
    }
}