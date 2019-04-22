import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches
{
    public static void main( String args[] ){
 
      // ��ָ��ģʽ���ַ�������
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(\\D*)(\\d+)(.*)";  // \D�������ַ�ƥ��
 
      // ���� Pattern ����
      Pattern r = Pattern.compile(pattern);
 
      // ���ڴ��� matcher ����
      Matcher m = r.matcher(line);
      
      if (m.find( )) {  // true
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) ); 
      } else {
         System.out.println("NO MATCH");
      }
      
      System.out.println(m.groupCount());  // 3
      System.out.println(m.find());        // false  
   }
}