package com.itheima.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/hurenxiang/Desktop/pic/test.txt",true);
        //写出数据
        String str = "abcdefghijklmn";
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        //写出一个换行符就可以了
        String srrr = "\r";
        byte[] bytes1 = srrr.getBytes();
        fileOutputStream.write(bytes1);
        String tnss = "55555";
        byte[] bytes2 = tnss.getBytes();
        fileOutputStream.write(bytes2);
        //关闭流
        fileOutputStream.close();
    }
}
