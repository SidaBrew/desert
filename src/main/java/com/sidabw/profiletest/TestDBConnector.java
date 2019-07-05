package com.sidabw.profiletest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/26.
 */
@Component
@Profile("testdb")
public class TestDBConnector implements DBConnector {

    @Override
    public void configure() {
        System.out.println("testdb");
    }

}
