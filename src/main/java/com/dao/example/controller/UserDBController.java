package com.dao.example.controller;

import com.dao.example.entity.User;
import com.dao.example.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *  Created by shao.guangze on 2019/5/31
 */
@RestController
@RequestMapping("/testBoot")
public class UserDBController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(int id) {


        return userService.Sel(id).toString();
    }

    @RequestMapping("/helloUser")
    public String selectUser(int id) {
        PageHelper.startPage(1, 2);
        PageHelper.orderBy("userName DESC");
        List<User> userList = userService.selectUser();
        System.out.println(userList.toString() + "---");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i) + "=============");
        }
        return userService.selectUser().toString();
    }


    @RequestMapping("/itemsPage")
    public List<User> itemsPage(int currentPage, int pageSize) {
        return userService.findItemByPage(currentPage, pageSize);
    }
}
