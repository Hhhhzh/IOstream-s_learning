package com.NicMark.transformation;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 演示OutputStreamWriter
 * 把FileOutputStream 字节流 转成字符流 OutputStreamWriter
 * 指定处理的编码 gdk/utf-8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\file\\演示OutputStreamWriter.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        osw.write("我是hzh");
        osw.close();
        System.out.println("按照"+"gdk"+"保存文件");
    }
}
