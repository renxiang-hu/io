package com.itheima.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/hurenxiang/Desktop/pic/test.txt");
        //写出数据
        String str = "我是一个中国人";
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        //释放资源
        fileOutputStream.close();
    }
}
