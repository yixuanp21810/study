package com.lx.study.spring.app;

import com.lx.study.spring.bean.pojo.User;
import com.lx.study.spring.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.lx.study.spring.mapper")
public class MultiDatasourceforspringbootApplicationTests {

    @Autowired
    private TestService testService;
    @Test
    public void contextLoads() {
        User user1 = testService.quety1(1);
        System.out.println("user1:"+user1);

        User user2 = testService.quety2(1);
        System.out.println("user2:"+user2);
        //主表为dataSource2
        User user3 = new User("我进主表了");
        int i = testService.addUser(user3);
        System.out.println(i);
        //查全部，走的是从表 dataSource1
        List<User> all = testService.getAll();
        System.out.println(all);

    }

}
