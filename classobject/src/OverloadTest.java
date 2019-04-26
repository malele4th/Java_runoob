
public class OverloadTest {
    public void test(){
        System.out.println("test1");
    }
 
    public int test(int a){
        System.out.println("test2");
        return a;
    }   
 
    //以下两个参数类型顺序不同
    public String test(int a, String s){
        System.out.println("test3");
        return "test3"+a;
    }   
 
    public String test(String s, int a){
        System.out.println("test4");
        return "test4"+a;
    }   
 
    public static void main(String[] args){
        OverloadTest o = new OverloadTest();
        o.test();
        System.out.println(o.test(1));
        System.out.println(o.test(3,"test3"));
        System.out.println(o.test("test4",4));
    }
}