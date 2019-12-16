package com.httpclient;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

/***
 *  Created by shao.guangze on 2019/11/26
 */
@SpringBootTest
public class RestTemplateTest {
    private  static Logger logger = LoggerFactory.getLogger(RestTemplateTest.class);
    @Autowired
    private RestTemplate restTemplate;

    /**
     * restTemplate练习
     * @return
     */
    @Test
    public JSONObject  echo(){
        System.out.println("可以访问userInfo");
        return restTemplate.getForObject("http://localhost:8080/test/testDoPost",JSONObject.class);
    }

}
