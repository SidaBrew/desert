package com.stream;

import java.io.*;

public class CopyImg {

    public static void main(String args[]) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\issuser\\Pictures\\Saved Pictures\\fei.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\temp\\fei.jpg"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bufferedInputStream.read(bytes)) != -1) {

            bufferedOutputStream.write(bytes, 0, len);
        }
        if(bufferedInputStream !=null){

            bufferedInputStream.close();
        }
        if (bufferedOutputStream !=null) {
            bufferedOutputStream.close();
        }
    }
}