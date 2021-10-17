package com.NicMark.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 演示 InputStreamReader 转换流结局中文乱码问题
 * 将字节流 FileInputStream 转换成字符流 InputStreamReader，指定编码 gbk、utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\MyFriend.txt";
        //1 把 FileInputStream 转换成 InputStreamReader
        //2 指定编码utf-8
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"utf-8"));
        //3 把InputStreamReader 传入 BufferedReader;
        String s = br.readLine();
        System.out.println("读取到的内容"+s);
        br.close();
    }

}
