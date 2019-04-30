
public class GenericMethodMax {
   // 比较三个值并返回最大值
   public static <T extends Comparable<T>> T maximum(T x, T y, T z)   // 类型T必须实现 Comparable的接口，并且这个接口的类型是T
   {                     
      T max = x; 
      if ( y.compareTo( max ) > 0 ){
         max = y; 
      }
      if ( z.compareTo( max ) > 0 ){
         max = z;        
      }
      return max;
   }
   public static void main( String args[] )
   {
      System.out.println(maximum( 3, 4, 5 ));
      System.out.println(maximum( 6.6, 8.8, 7.7 ));
      System.out.println(maximum( "pear", "apple", "orange" ));
   }
}