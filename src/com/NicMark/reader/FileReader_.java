package com.NicMark.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01(){
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\MyFriend.txt";
        //1.创建一个FileReader对象
        FileReader filereader = null;
        int data = ' ';
        try {
            filereader = new FileReader(filePath);
            //循环读取 使用read
            while ((data = filereader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(filereader!=null){
                try {
                    filereader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void readFile02(){
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\MyFriend.txt";
        //1.创建一个FileReader对象
        FileReader filereader = null;
        int len = 0;
        char[] buf = new char[8];
        try {
            filereader = new FileReader(filePath);
            //循环读取 返回的是实际读取到是字符数！！！
            while ((len = filereader.read(buf))!=-1){
                System.out.print(new String(buf,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(filereader!=null){
                try {
                    filereader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
