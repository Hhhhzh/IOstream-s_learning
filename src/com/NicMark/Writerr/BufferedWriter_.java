package com.NicMark.Writerr;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath ="C:\\Users\\DELL\\Desktop\\IO\\bufferedWriter.txt";
        //创建BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,NicMark");
        //插入一个换行
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
