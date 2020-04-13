package com.system.controller;

/***
 *  Created by shao.guangze on 2020/2/25
 */
public class Manager extends Employee {


    private  String bonus;

    public Manager(String name, String salary, String hireDay) {
        super(name, salary, hireDay);
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public  String getSalary(){

        return super.getSalary()+bonus;
    }

    public static void main(String[] args) {

        Manager boss = new Manager("sida","100","2");
        boss.setBonus("50");

        Employee[] staff = new Employee[3];
        staff[0]=boss;
        staff[1] =  new Employee("bun","50","2");
        staff[2] =  new Employee("bunss","60","2");

        for (Employee s: staff) {

            //System.out.println(s.getName()+s.getSalary());
        }

        Double a = 12.2;
        Double b = 12.3;
        System.out.println(a+" "+b);


    }
}
