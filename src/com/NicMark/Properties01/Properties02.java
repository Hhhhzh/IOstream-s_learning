package com.NicMark.Properties01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //创建一个Properties对象
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("src\\Mysql.properties"));
        //3.k-v显示到控制台
        properties.list(System.out);
        System.out.println("====================");
        //单独取某个值
        String user = properties.getProperty("user");
        System.out.println(user);
    }
}
