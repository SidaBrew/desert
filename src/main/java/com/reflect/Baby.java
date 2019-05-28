package com.reflect;

/***
 *  Created by shao.guangze on 2019/3/22
 */
public class Baby extends Brew implements SidaInterface {
    String name;
    private  int age;
    public char sex='m';
    public Baby(){
        System.out.println("无参构造");
    }

    public Baby(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
