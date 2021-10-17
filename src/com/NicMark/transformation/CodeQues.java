package com.NicMark.transformation;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 看一个中文代码
 */
public class CodeQues {
    public static void main(String[] args) throws Exception{
        //1.创建字符输入流 BufferedReader
        //2.使用BUfferedReader 对象读取
        //默认情况下，是按照UTF-8编码
        String filePath ="C:\\Users\\DELL\\Desktop\\IO\\Myfriend.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        //2，3合在一起写
        String s =br.readLine();
        System.out.println("读取到的内容："+s);
        br.close();
    }
}
