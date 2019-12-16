package com.system.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

@RestController
@RequestMapping("/http")
public class HttpClientController {

    private static final Logger logger = LoggerFactory.getLogger(HttpClientController.class);
    /**
     * post
     * content-Type :application/json
     * @param map
     * @return
     */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public JSONObject postTest(@RequestBody Map map){
        System.out.println("data = " + map.get("date"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sida","lalala");
        jsonObject.put("date",map.get("date"));
        System.out.println("nijiu ");
        return jsonObject;
    }

    /**
     * post
     * content-Type :form-data
     * @return
     */
    @RequestMapping(value = "/formData",method = RequestMethod.POST)
    public String formData(String param1,String param2){
        System.out.println("data = " +param1+","+ param2);
        return "success";
    }
    /**
     * 多文件上传
     * @param file
     * content-Type:multipart/form-data
     * @return
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile[] file) {

        for (MultipartFile multipartFile :file) {
            if (multipartFile.isEmpty()) {
                return "上传失败，请选择文件";
            }
            String fileName = multipartFile.getOriginalFilename();
            String filePath = "/d:/copy/";
            File dest = new File(filePath + fileName);
            try {
                multipartFile.transferTo(dest);
                logger.info("上传成功");
            } catch (IOException e) {
                logger.error(e.toString(), e);
                return "上传失败！";
            }
        }
        return "上传成功！";
    }

    /**
     * 文件下载
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public String downLoad(HttpServletResponse response) throws Exception {
        String filename="1.txt";
        String filePath = "D:/temp" ;
        File file = new File(filePath + "/" + filename);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            // response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" +   java.net.URLEncoder.encode(filename,"UTF-8"));
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;

            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                //int i = bis.read(buffer);
                int i = -1;
                while((bis.read(buffer)) != -1){
                    os.write(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (bis !=null){
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis !=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (os !=null){
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("----------file download---" + filename);

        }
        return "redirect:/hello/helloJsp";
    }


}
