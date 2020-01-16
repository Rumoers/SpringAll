package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzh
 * @description
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {
        System.out.println(id);
    }
    @GetMapping("/hello")
    public String hello() {
        log.info("[{}]执行{}方法！", this.getClass().getSimpleName(), "hello");
        return "Hello!";
    }
}
