package com.enums;

/***
 *  Created by shao.guangze on 2020/5/24
 */
public enum Color {
//    方式一
//    RED, GREEN, BLANK, YELLOW
    RED("红色",1),GREAN("绿色",2),YELLO("黄色",3);

    //成员变量
    private String name;

    private Integer index;

    //构造方法
    Color(String name, Integer index) {

        this.name = name;
        this.index = index;
    }

    //普通方法
    public static String getName(int index) {

        for (Color c: Color.values()) {

            if (c.index==index) {
                return  c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}


