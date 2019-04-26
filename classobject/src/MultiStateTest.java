
public class MultiStateTest {

    public static void main(String[] args) {
      show(new Cat4());  // 以 Cat 对象调用 show 方法
      show(new Dog4());  // 以 Dog 对象调用 show 方法
                
      Animal4 a = new Cat4();  // 向上转型  
      a.eat();               // 调用的是 Cat 的 eat
      Cat4 c = (Cat4)a;        // 向下转型  
      c.work();        // 调用的是 Cat 的 work
  }  
            
    public static void show(Animal4 a)  {
    	a.eat();  
        // 类型判断
        if (a instanceof Cat4)  {  // 猫做的事情 
            Cat4 c = (Cat4)a;  
            c.work();  
        } else if (a instanceof Dog4) { // 狗做的事情 
            Dog4 c = (Dog4)a;  
            c.work();  
        }  
    }  
}
 
abstract class Animal4 {    // abstract 声明抽象
    abstract void eat();  
}  
  
class Cat4 extends Animal4 {  
    public void eat() {  
        System.out.println("吃鱼");  
    }  
    public void work() {  
        System.out.println("抓老鼠");  
    }  
}  
  
class Dog4 extends Animal4 {  
    public void eat() {  
        System.out.println("吃骨头");  
    }  
    public void work() {  
        System.out.println("看家");  
    }  
}