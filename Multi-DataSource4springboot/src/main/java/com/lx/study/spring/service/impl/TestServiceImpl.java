package com.lx.study.spring.service.impl;

import com.lx.study.spring.bean.annotation.DataSource;
import com.lx.study.spring.bean.pojo.User;
import com.lx.study.spring.mapper.TestMapper;
import com.lx.study.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Auther: lixiao
 * @Date: 2019/2/23 17:54
 */
@Service
@DataSource(dataSource = "dataSource2")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public User quety1(Integer id) {
        return testMapper.getUserByID(id);
    }

    @Override
    public User quety2(Integer id)  {
        return testMapper.getUserByID(id);
    }

    @Override
    public int addUser(User user) {
        return testMapper.addUser(user);
    }

    @Override
    public List<User> getAll() {
        return testMapper.getAll();
    }

    public static void main(String[] args){

    }
}
