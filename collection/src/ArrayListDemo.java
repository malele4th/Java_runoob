
import java.util.*;

public class ArrayListDemo{
 public static void main(String[] args) {
     List<String> list = new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHA");
     
     //��һ�ֱ�������ʹ��for each����List
     for (String str : list) {          
        System.out.println(str);
     }
 
     //�ڶ��ֱ������������Ϊ������ص����ݽ��б���
     String[] strArray = new String[list.size()];
     list.toArray(strArray);
     for(int i=0;i<strArray.length;i++) 
     {
        System.out.println(strArray[i]);
     }
     
     // �����ֱ��� ʹ�õ�����������ر���
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
     {
         System.out.println(ite.next());
     }
 }
}
