package com.redis;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;

public class RedisPoolTest {

    private  String a = "";

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    //使用Jedis的数据库连接池
    public static void main(String[] args) {

        //1.配置连接池的相关参数
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);
        jedisPoolConfig.setMinIdle(10);
        jedisPoolConfig.setMaxWaitMillis(3000);

        JedisPool jedisPool;
        Jedis jedis;

        //2.按照配置参数设置连接池对象
        jedisPool= new JedisPool(jedisPoolConfig,"127.0.0.1",6379);
        //3.使用连接时从连接池获取对象
        jedis = jedisPool.getResource();

        strTest(jedis);

        jedisPool.close();
        jedis.close();
    }

    private static void strTest(Jedis jedis) {

        HashMap<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");

        String strMap = JSONObject.toJSONString(map);

        jedis.set("str_test",strMap);
        if(!jedis.exists("str_test")){

            //NX：不存在是才set EX：秒 PX:毫秒
            System.out.println("key " + "str_test" + " not exist!");
            jedis.set("str_test",strMap,"NX","EX",10);

        }else{

            //XX：存在是才set
            System.out.println("key " + "str_test" + " exist!");
            jedis.set("str_test",strMap,"XX","EX",10);
        }

        System.out.println(jedis.get("str_test"));


    }
}
