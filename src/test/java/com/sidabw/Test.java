package com.sidabw;

import com.example.entity.User;
import com.example.service.UserService;
import com.example2.service.SchedulerJobService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/***
 *  Created by shao.guangze on 2019/3/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    UserService userService;

    @Autowired
    SchedulerJobService schedulerJobService;
    @org.junit.Test
    public void getLearn(){

       // List<User> users = userService.selectUser();
        User sel = userService.Sel(1);
        System.out.println(sel.getUsername());
        schedulerJobService.method();



    }

}
