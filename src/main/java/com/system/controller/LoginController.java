package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {

    /**
     *
     * 跳转登陆页面
     * @param request
     * @return
     */
//    @RequestMapping("/loginJsp")
//    public String loginJsp(HttpServletRequest request){
//
//
//        return  "WEB-INF/jsp/login.jsp";
//    }

    @RequestMapping("/dologin")
    public String doLogin(HttpServletRequest request,String usrename, String password){
        HttpSession session = request.getSession();
        //判断是否是第一次 存入session 用户信息
        if(StringUtils.isEmpty(usrename)|| StringUtils.isEmpty(password)){
            return  "/login";
        }else if(session ==null){
            session.setAttribute("username",usrename);
            session.setAttribute("username",password);
        }else{
            //与数据库进行校验
        }


        return  "";
    }

    @RequestMapping("/a/b")
    public void method(){
        System.out.println("可以访问/a/b");
    }
}
