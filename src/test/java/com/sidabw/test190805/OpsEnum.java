package com.sidabw.test190805;

/***
 *  Created by shao.guangze on 2019/8/5
 */
public enum OpsEnum {

    DelFenliu("删除分流", "1");

    String comment;

    String flag;

    OpsEnum(String comment, String flag) {
        this.comment = comment;
        this.flag = flag;
    }

    String getFlag(){
        return flag;
    }
    
}
