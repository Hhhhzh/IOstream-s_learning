package com.NicMark.Properties01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Proper01 {
    public static void main(String[] args) throws IOException {
        //读取Mysql文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Mysql.properties"));
        String line = "";
        while((line = bufferedReader.readLine())!=null){
            //循环读取
            String[] split = line.split("=");
            //如果我们要求指定得到ip
            if("ip".equals(split[0])){
            System.out.println(split[0]+"值是："+split[1]);}

        }
        bufferedReader.close();
    }
}
