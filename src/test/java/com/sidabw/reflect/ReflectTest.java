package com.sidabw.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/***
 *  Created by shao.guangze on 2019/3/22
 */
public class ReflectTest {

    /**
     12      * 反射机制获取类有三种方法
     13      */

    public void testGetClass() throws ClassNotFoundException {

        Class<Baby> babyClass = Baby.class;
        System.out.println("通过类名.class:"+babyClass);
        Baby baby = new Baby();
        Class<? extends Baby> aClass = baby.getClass();
        System.out.println("对象.getClass:"+aClass);
        Class<?> aClass1 = Class.forName("com.sidabw.reflect.Baby");
        System.out.println("Class.forName:"+aClass1);


    }

    public static void main(String[] args) throws Exception{

//        ReflectTest test = new ReflectTest();
//
//        test.testGetClass();

//        String a = new String("sida");

//        Class<Baby> babyClass = Baby.class;
//        Constructor<Baby> constructors = babyClass.getConstructor(String.class,int.class,char.class);
//        Baby sida = constructors.newInstance("sida",1,'女');
//        System.out.println(sida);

//        Integer [] a = {1,2,3};
//        List<Integer> ints = Arrays.asList(a);
//        for (Integer anInt : ints) {
//
//
//            System.out.println(anInt);
//
//        }

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final Optional<Integer> sum = numbers.stream().reduce((a, b) -> {
            return  a + b;
        });
        System.out.println(sum);


    }








}
