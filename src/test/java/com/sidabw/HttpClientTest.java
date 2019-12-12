package com.sidabw;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class HttpClientTest {

    public static void main(String args[]){

        //postMethod();
        // getMethod();
        getPic();

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

}
