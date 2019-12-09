package com.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriteTest {

    public static void main(String args[]) throws IOException {

        FileReader reader = new FileReader("D:/temp/1.txt");

        FileWriter writer = new FileWriter("D:/copy/2.txt");

        //文本文件复制，一次读一个字节
        //method1(reader,writer);

        //文本文件复制，一次读一个字符数组
        method2(reader,writer);

        reader.close();
        writer.close();
    }

    private static void method1(FileReader reader, FileWriter writer) throws IOException {
        int ch =0;
        while ((ch=reader.read())!=-1){//读数据
            writer.write(ch);
        }
        writer.flush();
    }

    private static void method2(FileReader reader, FileWriter writer) throws IOException {
        char[] chs = new char[1024];
        int len =0;
        while((len=reader.read(chs))!= -1){

            writer.write(chs);
        }
        writer.flush();
    }
}
