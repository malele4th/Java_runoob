class Animal3{
   public void move(){
      System.out.println("��������ƶ�");
   }
}
 
class Dog3 extends Animal3{
   public void move(){
      super.move(); // Ӧ��super��ķ���
      System.out.println("�������ܺ���");
   }
}
 
public class OverrideSuper{
   public static void main(String args[]){
 
      Animal3 b = new Dog3(); // Dog ����
      b.move(); //ִ�� Dog��ķ���
 
   }
}