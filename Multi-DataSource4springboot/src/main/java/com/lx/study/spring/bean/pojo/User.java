package com.lx.study.spring.bean.pojo;

import lombok.Data;
import org.springframework.core.annotation.Order;

/**
 * @program: multi-datasourceforspringboot
 * @description: 用户
 * @author: lixiao
 * @create: 2019-02-24 22:20
 **/
@Data
public class User {
    private Integer id;
    private String name;
    public User(String name){
        this.name = name;
    }
    public User(){}
}
