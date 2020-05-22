package com.annotation;

/***
 *  Created by shao.guangze on 2020/5/10
 */
public class User {
    private  String name;
    private  String age;

    public String getName() {
        return name;
    }

    @AnnotationDemo(value="liang")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @AnnotationDemo(value = "23")
    public void setAge(String age) {
        this.age = age;
    }
}
