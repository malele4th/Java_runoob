
public class TestStatic {
    public static void main(String[] args) {
        System.out.println("��̬������ֵ");
        System.out.println("  ��̬����������:" + A.staticA);  // A1
        
        A a = new A();
        System.out.println("  ������������:" + a.staticA);  // A2
        
        a.toChange();
        System.out.println("  ��̬����1������:" + A.staticA);  // A3
        
        a.toChange2();
        System.out.println("  ��̬����2������:" + A.staticA);  // A4
        
        System.out.println("������ֵ");
        System.out.println("  ��̬��丳ֵ:" + B.staticB);  // B
    }
}

class A { 
    public static  String  staticA ="A" ;  
    //��̬�����޸�ֵ 
    static{  staticA ="A1"; } 
    
    //�������޸�ֵ
    public A (){  staticA ="A2"; } 
    
    //��̬���������� 
    public static void toChange(){  staticA ="A3"; } 
    public static void toChange2(){  staticA ="A4"; }  
}

class B { 
    public static final String  staticB ;  // �����븳ֵ���� 
    static{  staticB ="B"; }
}