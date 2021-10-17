package com.NicMark.Writerr;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFile = "C:\\Users\\DELL\\Desktop\\IO\\BUFFEREDREADER.txt";
        String desFile = "C:\\Users\\DELL\\Desktop\\IO\\file\\None.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFile));
            bw = new BufferedWriter(new FileWriter(desFile));
            //读取
            while ((line = br.readLine())!=null){
                //没读取一行，就录入一次
                bw.write(line);
                //换行！！！！！
                //插入一个换行
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
          if(br!=null){
              try {
                  br.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          if (bw!=null);
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
