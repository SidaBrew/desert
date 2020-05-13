package com.aop.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//启动Spring
@SpringBootTest
public class AopTest {

    @Autowired
    private  DemoAnnotationService demoAnnotationService;

    @Autowired
    private  DemoMethodService demoMethodService;

    @Test
    public  void Test() {
        demoAnnotationService.add();
        demoMethodService.add();
    }
}
