
import java.util.Arrays;

public class TestArrays {
    public static void output(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array, 5); // 填充数组
        TestArrays.output(array); // 5 5 5 5 5
        Arrays.fill(array, 2, 4, 8);
        TestArrays.output(array); // 5 5 8 8 5
        
        int[] array1 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
        Arrays.sort(array1, 2, 7); // 对数组的第2个到第6个进行排序
        TestArrays.output(array1); 
        Arrays.sort(array1); // 对整个数组进行排序
        TestArrays.output(array1);
        
        System.out.println(Arrays.equals(array, array1));  // false
        int[] array2 = array1.clone();
        System.out.println(Arrays.equals(array1, array2)); // true
        
        Arrays.sort(array1);
        System.out.println(Arrays.binarySearch(array1, 12)); // 8
        System.out.println(Arrays.binarySearch(array1, 9));  // 不存在，返回负数
    }
}