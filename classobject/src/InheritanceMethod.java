
public class InheritanceMethod {
    public static void main(String[] args)
    {
        Cat cat=new Cat("Jack","黑色");
        cat.eat();
        cat.run();
        cat.sleep();
    }

}

class Animal1 
{
    String name;
  
    public Animal1(){}//必须要写这个构造函数，不然Cat类的代码会出错
    
    public Animal1(String name)
    {
        this.name=name;
    }
    
    void eat()
    {
        System.out.println(name+"正在吃");
    }
    
    void run()
    {
        System.out.println(name+"正在奔跑");
    }
    
    void sleep()
    {
        System.out.println(name+"正在睡觉");
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
        System.out.println(color+"的"+name+"正在吃鱼");
    }
}