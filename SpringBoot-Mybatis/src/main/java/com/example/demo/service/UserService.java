package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author xzh
 * @description
 */
public interface UserService {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void deleteUserById(Long id);
    public void updateUser(Long id, String userName, String passWord);

}
