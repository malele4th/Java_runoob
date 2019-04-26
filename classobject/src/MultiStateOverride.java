class Animal5{
   public int age; //�˴���Animal�ж�������Ϊint����Ϊage�ı���
   public void move(){
      System.out.println("��������ƶ�");
   }
}
 
class Dog5 extends Animal5{
   public double age;  //�˴���Dog�ж���������double,��Ϊage�ı�������Ȼint����Ҳ����
   public void move(){
       age = 10.00;
      System.out.println("�������ܺ���");
   }
}

class Cat5 extends Animal5{
   public void move(){
       super.age = 3;  //�˴��̳�age������ֵΪ3.�Ҹ�����δ���¶��������
      System.out.println("è������");
   }
}
 
public class MultiStateOverride{
    public static void main(String args[]){
        Animal5 a = new Animal5(); // Animal5 ����
        Animal5 b = new Dog5(); // Dog5 ����
        Animal5 c =new Cat5(); //Cat5 ����
        Dog5  d= new Dog5();
        Cat5  e= new Cat5();

        a.move();//ִ�� Animal5 ��ķ���
        b.move();//ִ�� Dog5 ��ķ���
        c.move();//ִ�� Cat5 ��ķ���
        d.move();//ִ��Dog5 ��ķ���
        e.move();//ִ�� Cat5 ��ķ���
        
        Object aValue = a.age;
        Object bValue = b.age;      // b.age������ageֵ��һ�����Զ����ageֵ��һ���Ǽ̳е�ageֵ
        Object cValue = c.age;     
        Object dValue = d.age;      // d.age������ageֵ��һ�����Զ����ageֵ��һ���Ǽ̳е�ageֵ
        Object eValue = e.age;
        
        System.out.println("The type of "+a.age+" is "+(aValue instanceof Double ? "double" : (aValue instanceof Integer ? "int" : "")));     // Animal5 ���е� age δ����ֵ
        System.out.println("The type of "+b.age+" is "+(bValue instanceof Double ? "double" : (bValue instanceof Integer ? "int" : "")));     // b.age������ageֵ�����ȡ������ΪAnimal5��int����ֵ
        System.out.println("The type of "+c.age+" is "+(cValue instanceof Double ? "double" : (cValue instanceof Integer ? "int" : "")));     // c.ageֻ��һ��ageֵ����super���̳е�Animal5�е�ageֵ���ٱ���ֵΪ3
        System.out.println("The type of "+d.age+" is "+(dValue instanceof Double ? "double" : (dValue instanceof Integer ? "int" : "")));     // d.age������ageֵ�����ȡ������ΪDog5��double����ֵ
        System.out.println("The type of "+e.age+" is "+(eValue instanceof Double ? "double" : (eValue instanceof Integer ? "int" : "")));     // c.ageֻ��һ��ageֵ����super���̳е�Animal5�е�ageֵ���ٱ���ֵΪ3
    }
}