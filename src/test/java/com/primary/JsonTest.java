package com.primary;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.utils.StringUtil;

/***
 *  Created by shao.guangze on 2020/5/29
 */
public class JsonTest {




    public static void main(String[] args) {

        String jsonDate = "{\n" +
                "\t\"respheaderdto\": {\n" +
                "\t\t\"businesscode\": \"NBS00001\",\n" +
                "\t\t\"reqid\": \"127.0.0.1\",\n" +
                "\t\t\"resultcode\": \"s\",\n" +
                "\t\t\"respdate\": \"2020-5-29\",\n" +
                "\t\t\"type\": \"resp\",\n" +
                "\t\t\"version\": \"1.0\"\n" +
                "\t},\n" +
                "\t\"result\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"chdrnum\": \"ch0000\",\n" +
                "\t\t\t\"chdrcop\": \"01\",\n" +
                "\t\t\t\"agntinfos\": {\n" +
                "\t\t\t\t\"agntname\": \"\\u5c0f\\u8d1d\",\n" +
                "\t\t\t\t\"agntcoy\": \"1\",\n" +
                "\t\t\t\t\"agntnum\": \"010\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"ligeinfos\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"life\": \"01\",\n" +
                "\t\t\t\t\t\"lifenum\": \"22323\",\n" +
                "\t\t\t\t\t\"coverinfos\": [\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"sumins\": \"800.0\",\n" +
                "\t\t\t\t\t\t\t\"insurprem\": \"7.80\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t]\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"chdrnum\": \"ch0000\",\n" +
                "\t\t\t\"chdrcop\": \"01\",\n" +
                "\t\t\t\"agntinfos\": {\n" +
                "\t\t\t\t\"agntname\": \"\\u5c0f\\u8d1d\",\n" +
                "\t\t\t\t\"agntcoy\": \"1\",\n" +
                "\t\t\t\t\"agntnum\": \"010\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"ligeinfos\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"life\": \"01\",\n" +
                "\t\t\t\t\t\"lifenum\": \"22323\",\n" +
                "\t\t\t\t\t\"coverinfos\": [\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"sumins\": \"800.0\",\n" +
                "\t\t\t\t\t\t\t\"insurprem\": \"7.80\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t]\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\n" +
                "\t]\n" +
                "}";

        JSONObject jsonObject = JSONObject.parseObject(jsonDate);

        JSONObject respheaderdto = jsonObject.getJSONObject("respheaderdto");
        if (respheaderdto ==null)  return;

        if ("s".equals(respheaderdto.getString("resultcode"))) {

            JSONArray resultList = jsonObject.getJSONArray("result");
            if (resultList ==null) return;

            for (Object o:  resultList) {

                JSONObject jsonObject1 = (JSONObject)o;
                String chdrnum = jsonObject1.getString("chdrnum");

                JSONObject agntinfos = jsonObject1.getJSONObject("agntinfos");
                String agntname = agntinfos.getString("agntname");
                String agntcoy = agntinfos.getString("agntcoy");

                JSONArray ligeinfos = jsonObject1.getJSONArray("ligeinfos");
                for (Object ligeinfo: ligeinfos) {

                    JSONObject lige = (JSONObject)ligeinfo;
                    String life = lige.getString("life");
                    JSONArray coverinfos = lige.getJSONArray("coverinfos");
                    for (Object c: coverinfos) {

                        JSONObject cover = (JSONObject)c;
                        String sumins = cover.getString("sumins");
                        String insurprem = cover.getString("insurprem");
                    }
                }
            }
        }




    }
}
