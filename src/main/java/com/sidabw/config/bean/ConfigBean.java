package com.sidabw.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2019/2/21.
 */
@ConfigurationProperties(prefix = "com.dudu")
public class ConfigBean {
    private  String name;
    private  String want;
    private  String  yearhope;

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

    public String getYearhope() {
        return yearhope;
    }

    public void setYearhope(String yearhope) {
        this.yearhope = yearhope;
    }
}
