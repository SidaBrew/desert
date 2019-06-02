package com.sidabw.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2019/2/21.
 */
@ConfigurationProperties(prefix = "com.sidabw")
public class ConfigBean {
    private  String name;
    private  String want;
    private  String  yeahhope;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public String getYeahhope() {
        return yeahhope;
    }

    public void setYeahhope(String yeahhope) {
        this.yeahhope = yeahhope;
    }
}
