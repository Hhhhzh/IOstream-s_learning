package com.NicMark.outputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//完成数据的序列化
public class ObjectOutputStream_ {
    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是纯后缀的，而是按照他的格式来保存的
        String filePath = "C:\\Users\\DELL\\Desktop\\IO\\file\\data.dat";
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filePath));
            //序列化数据到data.dat文件中
            //本质是个对象
            obj.writeInt(100);//int -> Integer(实现了 Serializable)
            obj.writeBoolean(true);//boolean -> Boolean(实现了 Serializable)
            obj.writeChar('a');//char -> Character(实现了 Serializable)
            obj.writeDouble(9.5);//double -> Double(实现了 Serializable)
            obj.writeUTF("NicMark");//String(实现了 Serializable)

            //保存一个dog对象
            //系列化某个类的对象，必须将类Serializable
            obj.writeObject(new Dog("WANGCAI",23));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

}

    }
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Dog{"+
                "Name="+name+'\''+
                ",Age="+age+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
