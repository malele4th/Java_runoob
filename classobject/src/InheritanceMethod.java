
public class InheritanceMethod {
    public static void main(String[] args)
    {
        Cat cat=new Cat("Jack","��ɫ");
        cat.eat();
        cat.run();
        cat.sleep();
    }

}

class Animal1 
{
    String name;
  
    public Animal1(){}//����Ҫд������캯������ȻCat��Ĵ�������
    
    public Animal1(String name)
    {
        this.name=name;
    }
    
    void eat()
    {
        System.out.println(name+"���ڳ�");
    }
    
    void run()
    {
        System.out.println(name+"���ڱ���");
    }
    
    void sleep()
    {
        System.out.println(name+"����˯��");
    }
}

class Cat extends Animal1
{
    String color;
    public Cat(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    void eat()
    {
        System.out.println(color+"��"+name+"���ڳ���");
    }
}