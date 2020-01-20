package com.httpclient;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HttpClientTest {
    private static Logger logger = LoggerFactory.getLogger(HttpClientTest.class);

    public static void main(String args[]) {

    }

    //练习get请求方式
    @Test
    public  void get() {

        try {
            //创建HttpClient实例
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建HttpGet实例
            HttpGet httpGet = new HttpGet("http://localhost:8080/http/download");
            CloseableHttpResponse response = null;
            response = httpClient.execute(httpGet);
            if (response !=null) {

                //获取实体
                HttpEntity entity = response.getEntity();
                InputStream inputStream = entity.getContent();
                FileOutputStream fos = new FileOutputStream(new File("D:/chrome-downloads/1.txt"));
                byte[] bytes = new byte[1024];
                while (inputStream.read(bytes)!=-1){
                    fos.write(bytes);
                }
//               FileUtils.copyToFile(inputStream, new File("d:/copy/1.txt"));
            }
            response.close();
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //获取图片
    public static void getPic() {

        CloseableHttpClient httpclient = HttpClients.createDefault(); //创建httpclient
        HttpGet httpGet = new HttpGet("http://aimg2.tuicool.com/qm6Rre6.jpg!index"); //创建get 请求
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");

        try {
            CloseableHttpResponse httpentity = httpclient.execute(httpGet); //通过httpcleint 发送get 请求
            if (httpentity != null) {
                HttpEntity entity = httpentity.getEntity();
                //通过流的方式获取图片
                InputStream fileContent = entity.getContent();
                FileUtils.copyToFile(fileContent, new File("d:/temp/1.jpg"));

            }

            httpclient.close();
            httpentity.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * post请求
     * content-Type:form-date
     */
    @Test
    public void postForm() throws Exception {

        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求
        HttpPost httpPost = new HttpPost("http://localhost:8080/http/formData");
        httpPost.addHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
        List<BasicNameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("param1", "1111"));
        urlParameters.add(new BasicNameValuePair("param2", "2222"));
        httpPost.setEntity(new UrlEncodedFormEntity(urlParameters, HTTP.UTF_8));
        //组装数据
//        HashMap<String,String> body = new HashMap();
//        body.put("param1","sida");
//        body.put("param2","brew");
//        httpPost.setEntity(new StringEntity("param1=11&param2=12", Charset.forName("UTF-8")));

        CloseableHttpResponse response = null;
        try {
            //通过httpclient发送post请求
            response = httpClient.execute(httpPost);
            if (response != null) {
                //获取响应
                HttpEntity httpEntity = response.getEntity();
                System.out.println(EntityUtils.toString(httpEntity, "utf-8"));
            }
            httpClient.close();
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * httpclient练习接收json数据格式
     *
     * @param @RequestBody Map map
     * @return
     */
    @Test
    public void postData() {
        // return restTemplate.postForObject("http://localhost:8080//http//json", data,JSONObject.class);
        HashMap<String, String> body = new HashMap();
        body.put("date", "123");
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建post请求
        HttpPost httpPost = new HttpPost("http://localhost:8080//http//json");
        //返回结果
        JSONObject response = null;
        try {
            StringEntity stringEntity = new StringEntity(JSONObject.toJSONString(body));
            stringEntity.setContentEncoding("utf-8");

            //发送json数据需要设置contentType
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            logger.info("请求报文{}：", httpPost);
            HttpResponse res = httpClient.execute(httpPost);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {

                String result = EntityUtils.toString(res.getEntity());
                //返回json格式
                response = JSONObject.parseObject(result);
                System.out.println(response);
            }
        } catch (Exception e) {

            logger.info("doPost调用接口发生异常");
        }
    }

    @Test
    public void postMultipartFile() throws Exception {

        try {
            //创建httpClient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建post请求
            HttpPost httpPost = new HttpPost("http://localhost:8080/http/multiUploads");
            //组装数据
            FileInputStream inputStream = new FileInputStream(new File("/d:temp/1.jpg"));
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setCharset(Charset.forName("utf-8"));
            //解决中文乱码问题
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.addBinaryBody("file", bytes, ContentType.DEFAULT_BINARY, "1.jpg");
            HttpEntity entity = builder.build();
            httpPost.setEntity(entity);
            CloseableHttpResponse response = null;
            //通过httpclient发送post请求
            response = httpClient.execute(httpPost);
            if (response != null) {
                //获取响应
                HttpEntity httpEntity = response.getEntity();
                System.out.println(EntityUtils.toString(httpEntity, "utf-8"));
            }
            httpClient.close();
            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
