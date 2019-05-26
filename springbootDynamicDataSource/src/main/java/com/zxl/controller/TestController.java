package com.zxl.controller;

import com.zxl.bean.pojo.User;
import com.zxl.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zxl on 2019/5/26.
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    TestService test;

    @RequestMapping("/test1")
    public List<User> test() {
        List<User> list = new LinkedList<>();
        list.add(test.quety1(1));
        list.add(test.quety2(1));
        return list;
    }

    @RequestMapping("/test2")
    public int test2() {
        List<User> list = new LinkedList<>();
        list.add(test.quety1(1));
        User user = new User();
        user.setName("zhangxl");
        int i = test.addUser(user);
        return i;
    }
}
