package com.NicMark.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args){

    }
    @Test
    public void create01(){
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\01.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //new File(File parent,String child)//根据父目录文件+子路径构建
    @Test
    public void create02(){
        File file = new File("C:\\Users\\DELL\\Desktop\\IO\\");
        String filename = "news2.txt";
        File file1 = new File(file, filename);//在内存中创造一个对象
        try {
            file1.createNewFile();//真正将对象写入路径的内存中
            System.out.println("finish create");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //new File(String parent,String child)//根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "C:\\Users\\DELL\\Desktop\\IO\\";
        String filePath = "news03.txt";
        File file = new File(parentPath,filePath);
        try {
            file.createNewFile();
            System.out.println("finish create");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
