package com.itheima.io.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1、创建对象
 *    细节1：如果文件不存在，直接报错
 * 2、读取数据
 *    细节1：一次读一个字节，读出来的是数据在ASCII上对应的数字
 *    细节2：读到文件末尾了，read方法返回-1
 * 3、释放资源
 *    细节1：每次使用完流必须要释放资源
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        //2.读取数据
        int read = fileInputStream.read();
        System.out.println((char)read);
        //3.释放资源
        fileInputStream.close();
    }
}
