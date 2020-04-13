package com.sidabw.test190805;

/***
 *  Created by shao.guangze on 2019/8/5
 */
public class Demo {

    public static void main(String[] args){

        String company ="花蕾蕾";
        String year ="2020";
        String month ="3";
        String day ="31";
        String username ="sida";

        String str = "泰康人寿保险有限责任公司:\n贵公司那年那月至我方的";
        String strfor = String.format("泰康人寿保险有限责任公司", company, "分公司：");

        System.out.print(strfor);
    };


}
