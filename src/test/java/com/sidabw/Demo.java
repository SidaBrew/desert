package com.sidabw;

import org.junit.Test;
import org.springframework.util.StringUtils;

/***
 *  Created by shao.guangze on 2019/7/18
 */
public class Demo {


    public static void main(String[] args){
        String a  = "1";
        String b = "0";
        medth(a,b);
    }

    @Test
    public static  boolean  medth(String a,String b){

        if(!StringUtils.isEmpty(a)&& !"1".equals(a) && !"1".equals(b)){
            System.out.println("理赔审核");
            return false;
        }else{
            System.out.println("zidong审核");
            return true;

        }

    }

}
