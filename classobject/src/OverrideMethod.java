class Animal2{
   public void move(){
      System.out.println("动物可以移动");
   }
}
 
class Dog2 extends Animal2{
   public void move(){
      System.out.println("狗可以跑和走");
   }
}
public class OverrideMethod {
   public static void main(String args[]){
	      Animal2 a = new Animal2(); // Animal 对象
	      Animal2 b = new Dog2(); // Dog 对象
	 
	      a.move();// 执行 Animal 类的方法
	 
	      b.move();//执行 Dog 类的方法
	   }
}
