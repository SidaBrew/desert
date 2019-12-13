package com.sidabw.system.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/***
 *  Created by shao.guangze on 2019/11/26
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private  static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/userInfo")
    public String  testMetod(){
        System.out.println("可以访问userInfo");
        return "success";

    }


    @GetMapping("/echo")
    public JSONObject  echo(){
        System.out.println("可以访问userInfo");
        return restTemplate.getForObject("http://localhost:8080/test/testDoPost",JSONObject.class);
    }

    @PostMapping("/post")
        public JSONObject postData(@RequestBody JSONObject  date,String url) {
       // return restTemplate.postForObject("http://localhost:8080/test/restTemplatePost", data,JSONObject.class);
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求
        HttpPost httpPost = new HttpPost(url);
        //返回结果
        JSONObject response = null;
        try {
            StringEntity stringEntity = new StringEntity(date.toString());
            stringEntity.setContentEncoding("utf-8");

            //发送json数据需要设置contentType
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            logger.info("请求报文{}：",httpPost);
            HttpResponse res = httpClient.execute(httpPost);
            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){

                String result = EntityUtils.toString(res.getEntity());
                //返回json格式
                response = JSONObject.parseObject(result);
            }
        } catch (Exception e) {

            logger.info("doPost调用接口"+ url +"发生异常");
        }
        return  response;
    }

//    @ResponseBody
    @RequestMapping("/testDoPost")
    public JSONObject testDoPost(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data","luolei");
        return jsonObject;
    }

    @PostMapping("/restTemplatePost")
    public JSONObject postTest(@RequestBody JSONObject data){
         System.out.println("data = " + data);
         data.put("data","luolei");
        return data;
    }

}
