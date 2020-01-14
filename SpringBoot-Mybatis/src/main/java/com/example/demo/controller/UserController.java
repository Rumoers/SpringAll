package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xzh
 * @description
 */


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> list = userService.getAllUser();
        return list;
    }

    @RequestMapping("/saveUser")
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

    @RequestMapping("/updateUser")
    public void updateUser(Long id, String userName, String passWord) {
        userService.updateUser(id, userName, passWord);
    }
}

