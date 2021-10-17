package com.NicMark.Properties01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用 P 来创建配置文件
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","abc111");


        //k-v 存储文件中即可
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);


        ///修改
        //如果给文件没有key 则是创建
        //如果文件有key 就是修改
    }
}
