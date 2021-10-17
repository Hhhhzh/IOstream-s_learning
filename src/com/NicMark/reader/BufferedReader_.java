package com.NicMark.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\BUFFEREDREADER.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //bufferedReader在读取的时候底层是在使用FileReader
        String line;//按行读取，效率高
        line = bufferedReader.readLine();//返回字符串
        //当返回null时，表示读取完毕
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        //关闭流 只需要关闭bufferedreader
        bufferedReader.close();
    }
}
