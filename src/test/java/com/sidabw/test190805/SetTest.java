package com.sidabw.test190805;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

/***
 *  Created by shao.guangze on 2020/5/24
 */
public class SetTest {
    
    

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        list.add(2);
        list.add(4);
        list.add(7);
        list.add(2);

        list.stream().forEach(e->{
            set.add(e);
        });

       set.stream().forEach(s->{

           System.out.println(s);
       });

    }
    
}
