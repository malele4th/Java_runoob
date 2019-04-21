
public class TestStatic {
    public static void main(String[] args) {
        System.out.println("静态变量赋值");
        System.out.println("  静态语句块起作用:" + A.staticA);  // A1
        
        A a = new A();
        System.out.println("  构造器起作用:" + a.staticA);  // A2
        
        a.toChange();
        System.out.println("  静态方法1起作用:" + A.staticA);  // A3
        
        a.toChange2();
        System.out.println("  静态方法2起作用:" + A.staticA);  // A4
        
        System.out.println("常量赋值");
        System.out.println("  静态语句赋值:" + B.staticB);  // B
    }
}

class A { 
    public static  String  staticA ="A" ;  
    //静态语句块修改值 
    static{  staticA ="A1"; } 
    
    //构造器修改值
    public A (){  staticA ="A2"; } 
    
    //静态方法起作用 
    public static void toChange(){  staticA ="A3"; } 
    public static void toChange2(){  staticA ="A4"; }  
}

class B { 
    public static final String  staticB ;  // 声明与赋值分离 
    static{  staticB ="B"; }
}