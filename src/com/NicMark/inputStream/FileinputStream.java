package com.NicMark.inputStream;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\hello.txt";
        int readData = 0;
        FileInputStream fileinputStream = null;
        try{
            //创建对象，用于读取文件
        fileinputStream = new FileInputStream(filePath);
        while((readData = fileinputStream.read())!=-1){
            System.out.print((char)readData);
        };//读取一个字节的数据，若没有输入，则停止，返回-1，表示没有
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileinputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //使用read(byte[] b)读取文件，提高效率
    @Test
    public void readFile02(){
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\hello.txt";
        int readData = 0;
        //定义一个字节数组
        byte[] buf = new byte[8];//一次读取八个字节
        int read = 0;
        FileInputStream fileinputStream = null;
        try{
            //创建对象，用于读取文件
            fileinputStream = new FileInputStream(filePath);
            //
            while((read = fileinputStream.read(buf))!=-1){//返回值是实际读取的字节个数
                System.out.print((new String(buf,0, read)));
            };//读取一个字节的数据，若没有输入，则停止，返回-1，表示没有
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileinputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
