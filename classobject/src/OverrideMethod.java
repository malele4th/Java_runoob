class Animal2{
   public void move(){
      System.out.println("��������ƶ�");
   }
}
 
class Dog2 extends Animal2{
   public void move(){
      System.out.println("�������ܺ���");
   }
}
public class OverrideMethod {
   public static void main(String args[]){
	      Animal2 a = new Animal2(); // Animal ����
	      Animal2 b = new Dog2(); // Dog ����
	 
	      a.move();// ִ�� Animal ��ķ���
	 
	      b.move();//ִ�� Dog ��ķ���
	   }
}
