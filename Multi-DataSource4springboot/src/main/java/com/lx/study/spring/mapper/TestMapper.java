package com.lx.study.spring.mapper;

import com.lx.study.spring.bean.annotation.DataSource;
import com.lx.study.spring.bean.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Auther: lixiao
 * @Date: 2019/2/25 11:43
 */

public interface TestMapper {

    User getUserByID(Integer id);

    int addUser(User user);

    List<User> getAll();
}
