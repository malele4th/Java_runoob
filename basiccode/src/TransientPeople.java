/**
* Copyright (C), 2019-2020, Beijing, Chinese Academy of Sciences
* FileName: TransientPeople.java
* details: 
* (1)���������л�ʱ��д���ֽ����е�Ŀ���ļ�����transient��ֹʵ�����ô˹ؼ��������ı����־û���
* (2)�����󱻷����л�ʱ����Դ�ļ���ȡ�ֽ����н����ع�����������ʵ������ֵ���ᱻ�־û��ͻָ���

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

//����һ����Ҫ���л�����

class People implements Serializable{
    String name; //����
    transient Integer age; //����
    // int age;
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "���� = "+name+" ,���� = "+age;
    }

}

public class TransientPeople {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        People a = new People("����",30);
        System.out.println(a); //��ӡ�����ֵ
        
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("f://people.txt"));
        os.writeObject(a);//д���ļ�(���л�)
        os.close();
        
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("f://people.txt"));
        a = (People)is.readObject();//���ļ�����ת��Ϊ���󣨷����л���
        System.out.println(a); // ���� ����δ���壬����=null
        is.close();
    }
}