package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by XZH
 */
@Mapper
public interface UserMapper {
    User findByUserName(String userName);
}