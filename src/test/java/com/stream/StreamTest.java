package com.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    // 使用Stream.forEach()迭代
    @Test
    public void methed(){
        // Stream<String> stream = Stream.of("hello","brew");
        // stream.forEach(str ->System.out.println(str));
        ArrayList<String> list = new ArrayList<>();
        Stream<ArrayList> stream = Stream.of(list);
        list.add("sida");
        list.add("brew");
        list.add("forver");
        stream.forEach(lists ->System.out.println(lists));
    }
    //filter()
    @Test
    public void method1(){

        Stream<String> stream = Stream.of("sida","and","brew","bun");
        stream.filter(str ->str.length()==3).forEach(str ->System.out.println(str));
    }
    //distinct()
    @Test
    public void method2(){

        ArrayList<String> list = new ArrayList<>();
        Stream<ArrayList> stream = Stream.of(list);
        list.add("sida");
        list.add("brew");
        list.add("sida");
        stream.distinct().forEach(str ->System.out.println(str));
    }

    //sorted()
    @Test
    public void method3(){
        Stream<String> stream = Stream.of("sida","and","brew","bun","or");
        //自定义排序
        //stream.sorted((s1,s2 )->s1.length()-s2.length()).forEach(str ->System.out.println(str));
        //自然排序
        stream.sorted().forEach(str ->System.out.println(str));
    }

    //map()
    @Test
    public void method4(){
        Stream<String> stream = Stream.of("sida","and","brew","bun","or");
        stream.map(str ->str.toUpperCase()).forEach(str ->System.out.println(str));
    }

    //flatMap()
    @Test
    public void method5(){
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2),Arrays.asList(3,4,5));
        stream.flatMap(list ->list.stream()).forEach(i ->System.out.println(i));
    }
}
