package com.system.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;


@Controller
public class MultiUploadController {
    public static Logger logger = LoggerFactory.getLogger(MultiUploadController.class);

    @GetMapping("/multiUpload")
    public String multiUpload(){
        return "multiUpload";
    }

    /**
     * @param request 请求参数
     * @return 页面地址
     */
    @PostMapping("/multiUploads")
    @ResponseBody
    private String multiUploads(HttpServletRequest request) {

        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String filePath = "/D:/temp/";
        for (int i = 0; i < files.size(); i++) {
            MultipartFile multipartFile = files.get(i);
            if (multipartFile.isEmpty()) {
                return "上传第"+ i++ +"文件失败";
            }
            String originalFilename = multipartFile.getOriginalFilename();
            File dest = new File(filePath+originalFilename);
            try {
                multipartFile.transferTo(dest);
                logger.info("第" + (i + 1) + "个文件上传成功");
            } catch (IOException e) {
                logger.error("上传文件失败信息",e);
                return "上传第" + (i++) + "个文件失败";
            }
        }
        return "上传成功";
    }


}
