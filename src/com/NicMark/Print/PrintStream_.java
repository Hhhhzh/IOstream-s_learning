package com.NicMark.Print;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 延时字节打印流
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        out.println("NicMark,hello");//print的底层是wirte()
        out.write("你好".getBytes());
        out.close();
        //我们可以去修改打印输出的位置/设备
        System.setOut(new PrintStream("C:\\Users\\DELL\\Desktop\\IO\\file\\PrintSet.txt"));//设置修改输出位置
        System.out.println("这是测试的语句");
    }
}
