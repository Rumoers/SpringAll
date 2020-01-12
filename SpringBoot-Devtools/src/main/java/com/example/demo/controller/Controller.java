package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzh
 * @description devtools实现类
 */
@RestController
public class Controller {

    @RequestMapping(value = "hello")
    public String hello(){
        return "hello world";
    }
}
