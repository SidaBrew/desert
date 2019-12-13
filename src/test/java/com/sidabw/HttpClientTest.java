package com.sidabw;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class HttpClientTest {
    private  static Logger logger = LoggerFactory.getLogger(HttpClientTest.class);

    public static void main(String args[]){

        //postMethod();
        // getMethod();
       // getPic();

        String url = "http://localhost:8080/test/testDoPost";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("date","1");
        doPost(url,jsonObject);
    }

    //练习get请求方式
    public static void getMethod(){
        //创建HttpClient实例
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建HttpGet实例
        HttpGet httpGet = new HttpGet("https://www.cnblogs.com");
        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpGet);
            //获取实体
            HttpEntity entity = response.getEntity();
            //解析实体
            System.out.println(EntityUtils.toString(entity,"utf-8"));
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //练习post请求方式
    private static void postMethod()  {

        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求
       // HttpPost httpPost = new HttpPost("http://www.tuicool.com/");
        HttpGet httpPost = new HttpGet("https://www.cnblogs.com");
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");

        CloseableHttpResponse response = null;
        try {
            //通过httpclient发送post请求
            response = httpClient.execute(httpPost);
            if (response!=null) {
                //获取响应
                HttpEntity httpEntity = response.getEntity();
                System.out.println(EntityUtils.toString(httpEntity,"utf-8"));
            }
            httpClient.close();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取图片
    public static void getPic(){

        CloseableHttpClient httpclient = HttpClients.createDefault(); //创建httpclient
        HttpGet httpGet = new HttpGet("http://aimg2.tuicool.com/qm6Rre6.jpg!index"); //创建get 请求
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");

        try {
            CloseableHttpResponse httpentity  = httpclient.execute(httpGet); //通过httpcleint 发送get 请求
            if (httpentity !=null) {
                HttpEntity entity = httpentity.getEntity();
                //通过流的方式获取图片
                InputStream fileContent = entity.getContent();
                FileUtils.copyToFile(fileContent,new File("d:/temp/1.jpg"));

            }

            httpclient.close();
            httpentity.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 使用HttpClient发送和接收JSON请求
     */
    public static JSONObject doPost(String url,JSONObject jsonDate){

        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求
        HttpPost httpPost = new HttpPost();
        //返回结果
        JSONObject response = null;
        try {
            StringEntity stringEntity = new StringEntity(jsonDate.toString());
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
}
