package com.sidabw.controller;

import com.alibaba.fastjson.JSONObject;
import com.sidabw.config.ConfigBean;
import com.sidabw.config.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by Administrator on 2019/2/21.
 */
@RestController
public class UserController {
    @Autowired
    ConfigTestBean configTestBean;
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/")
    public String hexo() {
        return configTestBean.getUuid();
    }

    @RequestMapping("/a")
    public Integer hexo2() {
        return configTestBean.getTen();
    }

    @RequestMapping("/c")
    public Long hexo3() {
        return configTestBean.getBignumber();
    }

    @RequestMapping("/n")
    public String hexo4() {
        return configBean.getName();
    }

    @RequestMapping("/test")
    public void method() {
        HashSet<String> s = new HashSet<>();
        s.add("sida");
        s.add("brew");
        s.add("milkandbun");
        s.add("a");
        s.add("b");
        s.add("c");
        HashSet<String> s2 = new HashSet<>();
        s2.add("bv");
        s2.add("cv");
        ArrayList<Set> a = new ArrayList<>();
        a.add(s);
        a.add(s2);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", a);
        System.out.println(jsonObject.toJSONString());
    }

    @GetMapping("/user/filter")
    public String filterTest(){
        System.out.println("aa");
        return "aaa";
    }

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

    @PostMapping("/loginTest")
    public String test(){
        System.out.println("拦截器通过test ");
        return "测试通过";
    }
}

