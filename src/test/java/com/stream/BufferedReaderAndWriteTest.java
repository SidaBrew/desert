package com.stream;

import java.io.*;

public class BufferedReaderAndWriteTest {

    public static void main(String args[]) throws IOException {

        //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:/temp/1.txt"));
        //创建字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/copy/2.txt"));

        char[] chars = new char[1024];
        int len = 0;
        while ((len=br.read(chars))!=-1){
            System.out.println( len);
            bw.write(chars,0,len);
        }
        //释放资源
        br.close();
        bw.close();
    }
}
