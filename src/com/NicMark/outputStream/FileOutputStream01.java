package com.NicMark.outputStream;
import org.junit.Test;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream01 {
    private String str;
    public static void main(String[] args) {
    }

    /***
     * 演示使用FileOutputStream
     *
     */
    @Test
    public void writeFile(){
       //创建FileOutputStream对象
        //new FileOutputStream(filePath)此方式会覆盖原来的内容
        //追加方式：new FileOutputStream(filePath,true)创建内容，是追加到文件的后边
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\wirteIn.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            //fileOutputStream.write('N');
            //写入字符串
            String str = "hello,world，NicMark";
            //str.getBytes()把一个字符串转成一个字节数组
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
