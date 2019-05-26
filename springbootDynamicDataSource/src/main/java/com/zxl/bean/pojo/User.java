package com.zxl.bean.pojo;

import lombok.Data;

/**
 * @program: multi-datasourceforspringboot
 * @description: 用户
 * @author: zxl
 * @create: 2019-05-26
 **/
@Data
public class User {
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    public User(String name){
        this.name = name;
    }
    public User(){}
}
