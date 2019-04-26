
public class MultiStateTest {

    public static void main(String[] args) {
      show(new Cat4());  // �� Cat ������� show ����
      show(new Dog4());  // �� Dog ������� show ����
                
      Animal4 a = new Cat4();  // ����ת��  
      a.eat();               // ���õ��� Cat �� eat
      Cat4 c = (Cat4)a;        // ����ת��  
      c.work();        // ���õ��� Cat �� work
  }  
            
    public static void show(Animal4 a)  {
    	a.eat();  
        // �����ж�
        if (a instanceof Cat4)  {  // è�������� 
            Cat4 c = (Cat4)a;  
            c.work();  
        } else if (a instanceof Dog4) { // ���������� 
            Dog4 c = (Dog4)a;  
            c.work();  
        }  
    }  
}
 
abstract class Animal4 {    // abstract ��������
    abstract void eat();  
}  
  
class Cat4 extends Animal4 {  
    public void eat() {  
        System.out.println("����");  
    }  
    public void work() {  
        System.out.println("ץ����");  
    }  
}  
  
class Dog4 extends Animal4 {  
    public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }  
}