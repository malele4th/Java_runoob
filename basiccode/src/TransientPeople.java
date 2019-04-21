/**
* Copyright (C), 2019-2020, Beijing, Chinese Academy of Sciences
* FileName: TransientPeople.java
* details: 
* (1)当对象被序列化时（写入字节序列到目标文件），transient阻止实例中用此关键字声明的变量持久化；
* (2)当对象被反序列化时（从源文件读取字节序列进行重构），这样的实例变量值不会被持久化和恢复。

* @author malele
* @Date 2019/4/21
* @version 1.00
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//定义一个需要序列化的类

class People implements Serializable{
    String name; //姓名
    transient Integer age; //年龄
    // int age;
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "姓名 = "+name+" ,年龄 = "+age;
    }

}

public class TransientPeople {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        People a = new People("李雷",30);
        System.out.println(a); //打印对象的值
        
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("f://people.txt"));
        os.writeObject(a);//写入文件(序列化)
        os.close();
        
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("f://people.txt"));
        a = (People)is.readObject();//将文件数据转换为对象（反序列化）
        System.out.println(a); // 年龄 数据未定义，年龄=null
        is.close();
    }
}