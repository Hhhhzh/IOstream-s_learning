package com.NicMark.Writerr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter_ {
    public static void main(String[] args) {
        //创建一个FileWriter对象
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\FileWrite.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','v','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //1.写入单个字符
            fileWriter.write('H');
            //2.写入指定数组
            fileWriter.write(chars);
            //3.写入指定数组的部分内容
            fileWriter.write("尼科马克".toCharArray(),0,2);
            //4.直接写个字符串
            fileWriter.write("NicMark哈哈");
            //5.指定字符串的某一个部分
            fileWriter.write(" 上海天津",0,2);//空格也算入一个字符
            //在数据量大的情况下，使用循环操作
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                 //对应的filewriter，一定要关闭，或者flush，才能真正写入文件
        }


    }
}
