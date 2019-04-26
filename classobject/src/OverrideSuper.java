class Animal3{
   public void move(){
      System.out.println("动物可以移动");
   }
}
 
class Dog3 extends Animal3{
   public void move(){
      super.move(); // 应用super类的方法
      System.out.println("狗可以跑和走");
   }
}
 
public class OverrideSuper{
   public static void main(String args[]){
 
      Animal3 b = new Dog3(); // Dog 对象
      b.move(); //执行 Dog类的方法
 
   }
}