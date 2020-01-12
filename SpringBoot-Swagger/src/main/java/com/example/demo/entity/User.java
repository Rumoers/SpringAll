package com.example.demo.entity;

/**
 * @author xzh
 * @description 用户实体
 * @date 2020/1/11
 */
public class User {

    private Long id;
    private String name;
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
