package com.NicMark.file;

import org.junit.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
        //
    }

    //判断是否存在，如果存在就删除
    @Test
    public void m1() {
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\news03.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");//返回一个布尔值
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("不存在");
        }
    }

    //创建目录
    @Test
    public void m2() {
        String directoryPath = "C:\\Users\\DELL\\Desktop\\IO\\file";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在");//返回一个布尔值
        } else {
            if (file.mkdirs()) {
                System.out.println(directoryPath+"创建成功");
            } else {
                System.out.println(directoryPath+"创建失败");
            }
        }
    }
}
