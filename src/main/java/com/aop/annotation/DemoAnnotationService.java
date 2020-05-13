package com.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){

        System.out.println("查询数据库的接口,对这个方法进行增强。");
    };

}
