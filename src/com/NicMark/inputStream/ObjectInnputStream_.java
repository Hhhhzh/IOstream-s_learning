package com.NicMark.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInnputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\file\\data.dat";

        ObjectInputStream obji = null;
        try {
            obji = new ObjectInputStream(new FileInputStream(filePath));

            //读取的顺序（反序列化的顺序）要跟存放的顺序（序列化的顺序）一致
            //否则会出现异常
            System.out.println(obji.readInt());
            System.out.println(obji.readBoolean());
            System.out.println(obji.readChar());
            System.out.println(obji.readDouble());
            System.out.println(obji.readUTF());
            //dog 的编译类型是Obj，运行类型是Dog
            Object o = obji.readObject();
            System.out.println("运行类型="+o.getClass());//在底层把Obj转型成一只狗
            System.out.println("dog信息="+o);



            //如果我们希望调用Dog的方法
            //需要我们向下转型
            //需要我们将Dog类的定义，拷贝到可以引用的地方
            //Dog dog2 = (Dog)dog;

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            obji.close();
        }
    }
}
