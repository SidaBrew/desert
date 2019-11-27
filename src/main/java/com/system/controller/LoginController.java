package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    /**
     *
     * 跳转登陆页面
     * @param request
     * @return
     */
//    @RequestMapping("/loginJsp")
//    public String loginJsp(HttpServletRequest request){
//        System.out.println("loginJsp");
//
//        return  "/login";
//    }
    @ResponseBody
    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request,String userName, String password){
        System.out.println("doLogin");
        HttpSession session = request.getSession();
        //判断是否是第一次 存入session 用户信息
        if(StringUtils.isEmpty(userName)|| StringUtils.isEmpty(password)){
            return "login";
        }else{
            //与数据库进行校验,假定校验通过。写入session，放入用户信息。
            session.setAttribute("username",userName);
        }
        return  "redirect:/desert/hello/helloJsp";
    }


    @ResponseBody
    @RequestMapping("/a/b")
    public String method(){
        System.out.println("可以访问/a/b");

        return "redirect:/desert/hello/helloJsp";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String  testMetod(){
        System.out.println("可以访问test");
        return "success";

    }
}
