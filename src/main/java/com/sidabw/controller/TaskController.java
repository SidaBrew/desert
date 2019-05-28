package com.sidabw.controller;

import com.sidabw.profiletest.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/2/26.
 */
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private DBConnector connector ;
    @RequestMapping(value = {"/",""})
    public String hellTask(){

        connector.configure(); //最终打印testdb
        return "hello task !! myage is ";
    }



}
