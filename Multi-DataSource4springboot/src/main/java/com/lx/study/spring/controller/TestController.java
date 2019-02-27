package com.lx.study.spring.controller;

import com.lx.study.spring.bean.pojo.User;
import com.lx.study.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Auther: lixiao
 * @Date: 2019/2/23 17:58
 */
@RestController
@RequestMapping("test/")
public class TestController {
    @Autowired
    TestService test;
    @RequestMapping("/test1")
    public List<User> test(){
        List<User> list = new LinkedList<>();
        list.add(test.quety1(1));
        list.add(test.quety2(1));
        return list;
    }
}
