package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamAndOutputStream {

    public static void main(String args[]) throws IOException {

        //创建字节输入流
        FileInputStream fi = new FileInputStream("d:/temp/1.jpg");
        //创建字节输出流
        FileOutputStream fo = new FileOutputStream("D:/copy/2.jpg");

        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fi.read(bytes))!=-1){
            fo.write(bytes,0,len);
        }

        fi.close();
        fo.close();
    }
}
