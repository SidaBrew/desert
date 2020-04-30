package com.redis;


import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisJava {


        public static void main(String[] args) {

            //连接本地的 Redis 服务
            Jedis jedis = new Jedis("localhost");
            System.out.println("连接成功");
            //查看服务是否运行
            System.out.println("服务正在运行: "+jedis.ping());

            //设置 redis 字符串数据
            jedis.set("runoobkey","www.com.runoob");
            // 获取存储的数据并输出
            System.out.println("redis 存储的字符串为: "+jedis.get("runoobkey"));

            //存储数据到列表中
            jedis.lpush("site-list","runoob");
            jedis.lpush("site-list","Google");
            jedis.lpush("site-list","Taobao");
            // 获取存储的数据并输出
            List<String> siteList = jedis.lrange("site-list", 0, 2);
            for (int i = 0; i < siteList.size(); i++) {

                System.out.println("列表项为: "+siteList.get(i));
            }

//            Set<String> keys = jedis.keys("*");
//            Iterator<String> iterator = keys.iterator();
//            while (iterator.hasNext()){
//                String key = iterator.next();
//                System.out.println(key);
//            }

            jedis.mset("str1","v1","str2","v2","str3","v3");
            System.out.println(jedis.mget("str1","str2","str3"));

        }
}