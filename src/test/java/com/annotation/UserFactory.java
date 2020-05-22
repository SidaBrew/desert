package com.annotation;

import java.lang.reflect.Method;

/***
 *  Created by shao.guangze on 2020/5/10
 */
public class UserFactory {

    public static User create(){

        User user = new User();

        //获取user类中所有的方法
        Method[] methods = User.class.getMethods();

        try {

            for (Method method:methods) {

                //如果此方法有注解，就把数据里面的数据赋值到user对象
                if(method.isAnnotationPresent(AnnotationDemo.class)){

                    AnnotationDemo annotation = method.getAnnotation(AnnotationDemo.class);
                    method.invoke(user,annotation.value());
                }
            }
        }catch (Exception e){

        }
        return user;
    }

    public static void main(String[] args) {

        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());


    }

}
