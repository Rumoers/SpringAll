package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xzh
 * @description
 */
@Mapper
public interface UserMapper {
    public List<User> getAll();
    public void saveUser(User user);
    public void deleteUserById(Long id);
    public void updateUser(@Param("id") Long id, @Param("userName") String userName,
                           @Param("passWord") String passWord);
}
