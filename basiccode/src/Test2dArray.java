/**
* Copyright (C), 2019-2020, Beijing, Chinese Academy of Sciences
* FileName: Test2dArray.java
* details: 二维数组的动态初始化和引用
*
* @author malele
* @Date 2019/4/21
* @version 1.00
*/
public class Test2dArray {
	public static void main(String[] args) {
		String s[][] = new String[2][];
		
		s[0] = new String[2];  // 最高维分配引用空间，即限制其保存数据的最长的长度
		s[1] = new String[3];
		
		s[0][0] = new String("Good");  // 再为其每个数组元素单独分配空间
		s[0][1] = new String("Luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		System.out.println(s[1][1]);
	}
}
