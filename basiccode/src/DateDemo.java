
import  java.util.*;
import java.text.*;
 
public class DateDemo {
   public static void main(String args[]) {
      Date dateNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
      System.out.println("��ǰʱ��Ϊ: " + ft.format(dateNow));
   }
}