package com.lx.study.spring.service;

import com.lx.study.spring.bean.annotation.DataSource;
import com.lx.study.spring.bean.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Auther: lixiao
 * @Date: 2019/2/23 17:59
 */

public interface TestService {
     //使用默认数据源即第一个数据源 test1
     User quety1(Integer id);
     /**
      * 使用第二个数据源  即test2
      */
     User quety2(Integer id);

     int addUser(User user);
     List<User> getAll();
}
