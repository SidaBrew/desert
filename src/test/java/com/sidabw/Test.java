package com.sidabw;

import com.dao.example.entity.User;
import com.dao.example.service.UserService;
import com.dao.example2.service.SchedulerJobService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
