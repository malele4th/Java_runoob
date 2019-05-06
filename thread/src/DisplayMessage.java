import  java.util.*;
import java.text.*;

// 通过实现 Runnable 接口创建线程
public class DisplayMessage implements Runnable {
   private String message;
   
   public DisplayMessage(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}
