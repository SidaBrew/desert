package com.sidabw.controller;

import com.sidabw.dao.Course;
import com.sidabw.service.BlobService;
import com.sidabw.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 2019/2/21.
 */
@RestController
public class UserController {

    @Autowired
    private ICourseService courseServiceImpl;

    @Autowired
    private BlobService BlobServiceImpl;

    @PostMapping("/login")
    public String loginTest(HttpServletRequest request,String username,String passWord){

            if("zhangsan".equals(username)&& "123".equals(passWord)){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            session.setAttribute("passWord",passWord);
            System.out.println("login in");
            return "登陆成功";
        }else{
            return "登陆失败";
        }
    }

    @GetMapping("/qryCourse")
    public Course qryCourse(){

        return courseServiceImpl.getCourse();
    }
    @GetMapping("/saveCourseInfo")
    public int saveCourseInfo(){

        return courseServiceImpl.saveCourseInfo();
    }

    @PostMapping("/saveFileContent")
    public int saveFileContent(@RequestParam("file") MultipartFile file) throws IOException {
        InputStream is = file.getInputStream();
        return BlobServiceImpl.saveFileContent(is);
    }

    @PostMapping("/qryFileContent")
    public int qryFileContent() throws IOException {
        return BlobServiceImpl.qryFileContent();
    }
}

