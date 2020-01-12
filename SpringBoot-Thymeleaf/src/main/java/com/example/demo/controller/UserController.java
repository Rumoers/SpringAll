package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author xzh
 * @description
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/list")
    public String getList(ModelMap map){
        List<User> list=new ArrayList<User>();
        for(int i=0;i<5;i++){
            User u=new User();
            u.setUsername("xiaxx"+i);
            u.setPassword("mm"+i);
            list.add(u);
        }
        map.addAttribute("list",list);
        return "index";
    }
    @GetMapping("home")
    public String index(Model model) {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("112233");
        user.setHobbies(Arrays.asList(new String[]{"singing", "dancing", "football"}));
        Map<String, String> maps = new HashMap<>();
        maps.put("1", "o");
        maps.put("2", "g");
        maps.put("3", "a");
        maps.put("4", "j");
        user.setSecrets(maps);
        model.addAttribute("user", user);
        return "index2";
    }
}
