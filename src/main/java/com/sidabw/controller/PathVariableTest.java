package com.sidabw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/***
 *  Created by shao.guangze on 2020/5/24
 */
@RestController
@RequestMapping("/hello")
public class PathVariableTest {

    /**
     *占位符映射
     * 语法：@RequestMapping(value=”user/{userId}/{userName}”)
     * 请求路径：http://localhost:8080/hello/show5/1/james
     * @param ids
     * @param names
     * @return
     */

    @RequestMapping("show5/{id}/{name}")
    public String test(@PathVariable("id") Long ids , @PathVariable("name")String names) throws Exception {

        if (names.equals("james"))
            throw new Exception("aaa");

        return  names;
    }

}
