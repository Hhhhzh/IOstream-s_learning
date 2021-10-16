package com.NicMark.outputStream;

import com.NicMark.inputStream.FileinputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将C:\Users\DELL\Desktop\java2\src\resoure\plane.png拷贝
        //思路分析
        //1.创建文件的输入流，将文件读入到程序
        //2.创建文件的输出流，将读取到的文件数据，写入到指定位置
        //读取部分数据就写入到指定位置（循环）
        String filePath = "D:\\IO\\plane.png";
        String destPath = "D:\\IO\\IOWRITEN\\plane.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(destPath);

            //定义一个字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf))!=-1){
                //读取到后，就写入到目的地址
                //即是边读边写
                fileOutputStream.write(buf,0,readLen);//一定要使用这个方法
            }
            System.out.println("finish copying");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream!=null){
                fileInputStream.close();}
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
