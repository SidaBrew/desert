package com.aop;

import com.aop.annotation.Action;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc: 核心业务模块
 * @author: CSH
 **/
@RestController
@RequestMapping("/aopController")
public class AopController {

    @RequestMapping(value = "/Curry")
    public void Curry(){
        System.out.println("库里上场打球了！！");
    }

    @RequestMapping(value = "/Harden")
    public void Harden(){
        System.out.println("哈登上场打球了！！");
    }

    @RequestMapping(value = "/Antetokounmpo")
    public void Antetokounmpo(){
        System.out.println("字母哥上场打球了！！");
    }

    @RequestMapping(value = "/Jokic")
    public void Jokic(){
        System.out.println("约基奇上场打球了！！");
    }

    @RequestMapping(value = "/Durant/{point}")
    public void Durant(@PathVariable("point")  int point){
        System.out.println("杜兰特上场打球了！！");
    }

    @Action(name="注解式拦截的add操作")
    @RequestMapping(value = "/sida")
    public void add(){

        System.out.println("查询数据库的接口,对这个方法进行增强。");
    };

}