package com.NicMark.outputStream;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\IOli\\plane.png";
        String desPath = "C:\\Users\\DELL\\Desktop\\IO\\file\\plane.png";
        BufferedInputStream bufferedinputStream =null;
        BufferedOutputStream bufferedOutputStream =null;
        try {
            bufferedinputStream = new BufferedInputStream(new FileInputStream(filePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desPath));
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bufferedinputStream.read(buf)) != -1) {
                    bufferedOutputStream.write(buf,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedinputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

