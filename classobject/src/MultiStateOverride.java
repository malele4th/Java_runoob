class Animal5{
   public int age; //此处在Animal中定义类型为int，名为age的变量
   public void move(){
      System.out.println("动物可以移动");
   }
}
 
class Dog5 extends Animal5{
   public double age;  //此处在Dog中定义新类型double,名为age的变量。当然int尝试也可以
   public void move(){
       age = 10.00;
      System.out.println("狗可以跑和走");
   }
}

class Cat5 extends Animal5{
   public void move(){
       super.age = 3;  //此处继承age，并赋值为3.且该类中未重新定义变量。
      System.out.println("猫可以跳");
   }
}
 
public class MultiStateOverride{
    public static void main(String args[]){
        Animal5 a = new Animal5(); // Animal5 对象
        Animal5 b = new Dog5(); // Dog5 对象
        Animal5 c =new Cat5(); //Cat5 对象
        Dog5  d= new Dog5();
        Cat5  e= new Cat5();

        a.move();//执行 Animal5 类的方法
        b.move();//执行 Dog5 类的方法
        c.move();//执行 Cat5 类的方法
        d.move();//执行Dog5 类的方法
        e.move();//执行 Cat5 类的方法
        
        Object aValue = a.age;
        Object bValue = b.age;      // b.age有两个age值，一个是自定义的age值，一个是继承的age值
        Object cValue = c.age;     
        Object dValue = d.age;      // d.age有两个age值，一个是自定义的age值，一个是继承的age值
        Object eValue = e.age;
        
        System.out.println("The type of "+a.age+" is "+(aValue instanceof Double ? "double" : (aValue instanceof Integer ? "int" : "")));     // Animal5 类中的 age 未被赋值
        System.out.println("The type of "+b.age+" is "+(bValue instanceof Double ? "double" : (bValue instanceof Integer ? "int" : "")));     // b.age有两个age值，输出取引用名为Animal5的int类型值
        System.out.println("The type of "+c.age+" is "+(cValue instanceof Double ? "double" : (cValue instanceof Integer ? "int" : "")));     // c.age只有一个age值，是super所继承的Animal5中的age值，再被赋值为3
        System.out.println("The type of "+d.age+" is "+(dValue instanceof Double ? "double" : (dValue instanceof Integer ? "int" : "")));     // d.age有两个age值，输出取引用名为Dog5的double类型值
        System.out.println("The type of "+e.age+" is "+(eValue instanceof Double ? "double" : (eValue instanceof Integer ? "int" : "")));     // c.age只有一个age值，是super所继承的Animal5中的age值，再被赋值为3
    }
}