package com.sidabw.reflect;

/***
 *  Created by shao.guangze on 2019/3/22
 */
public class ReflectTest {

    /**
     12      * 反射机制获取类有三种方法
     13      */

    public void testGetClass() throws ClassNotFoundException {

        Class clazz = null;
        Class<Baby> babyClass = Baby.class;
        System.out.println("通过类名.class:"+babyClass);
        Baby baby = new Baby();
        Class<? extends Baby> aClass = baby.getClass();
        System.out.println("对象.getClass:"+aClass);
        Class<?> aClass1 = Class.forName("com.sidabw.reflect.Baby");
        System.out.println("Class.forName:"+aClass1);


    }

    public static void main(String[] args) throws ClassNotFoundException {

        ReflectTest test = new ReflectTest();

        test.testGetClass();

    }








}
