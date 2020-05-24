package com.enums;

/***
 *  Created by shao.guangze on 2020/5/24
 */
public class EnumTest {
    public static void main(String[] args) {
//        Color red = Color.valueOf("RED");
//        Color[] values = Color.values();
//        System.out.print(red);
//        String name = Color.getName(1);
//        System.out.print(name);
        Color color = Color.valueOf("RED");
        System.out.print(color.getIndex());

    }
}
