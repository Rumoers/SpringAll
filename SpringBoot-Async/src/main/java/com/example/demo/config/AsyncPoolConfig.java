package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xzh
 * @description 自定义线程池
 */
@Configuration
public class AsyncPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor asyncThreadPoolTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程数，默认为1
        executor.setCorePoolSize(20);
        //线程池最大线程数。只有当核心线程都被用完并且缓冲队列满后，才会开始申超过请核心线程数的线程，默认值为Integer.MAX_VALUE
        executor.setMaxPoolSize(200);
        //缓冲队列
        executor.setQueueCapacity(25);
        //超出核心线程数的线程的空闲时候的最大存活时间
        executor.setKeepAliveSeconds(200);
        //线程名字前缀
        executor.setThreadNamePrefix("asyncThread");
        //是否等待全部线程执行完毕才关闭线程池。默认false
        executor.setWaitForTasksToCompleteOnShutdown(true);
        //setWaitForTasksToCompleteOnShutdown的等待时长，默认为0，不等待
        executor.setAwaitTerminationSeconds(60);
        //线程的处理策略 默认为abortPolicy
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        executor.initialize();
        return executor;
    }
}