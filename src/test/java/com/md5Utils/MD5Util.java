package com.md5Utils;

import java.security.MessageDigest;


/***
 *  Created by shao.guangze on 2020/4/13
 */
public class MD5Util {

    public static String encrypt(String str) {

        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        try {
            byte[] btInput = str.getBytes("utf-8");
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char c[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                c[k++] = hexDigits[byte0 >>> 4 & 0xf];
                c[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(c);
        } catch (Exception e) {
            return null;
        }

    }

    public static void main(String[] args) {
         System.out.println(System.currentTimeMillis()/1000);

         System.out.println(encrypt("appkey1app_keyappkey1&auth_no2014032200002001210000000614&formatjson&methodecaop.trades.sell.mob.comm.transfer.financeprod&servicealipay.fund.auth.query&session123234213123&sign_methodmd5&timestamp2014-04-08 14:08:55&v2.0appkey1"));
         System.out.println(encrypt("appkey1" +
         "app_keyappkey1&" +
         "apptype2&" +
         "custid123456&" +
         "formatjson&" +
         "methodecaop.trades.user.comm.qry.idlertimeflowpackage&" +
         "phonenum18658880889&" +
         "session123234213123&" +
         "sign_methodmd5&" +
         "timestamp2014-01-04 16:14:11&" +
         "v2.0&" +
         "appkey1"));
        System.out.println(encrypt("mrtliao"));
    }

}
