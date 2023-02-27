package com.itheima.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/hurenxiang/Desktop/pic/test.txt");
        byte[] bytes =  {97,98,99,100,101};
        fileOutputStream.write(bytes,1,3);
        fileOutputStream.close();
    }
}
