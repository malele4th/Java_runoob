/**
* Copyright (C), 2019-2020, Beijing, Chinese Academy of Sciences
* FileName: Test2dArray.java
* details: ��ά����Ķ�̬��ʼ��������
*
* @author malele
* @Date 2019/4/21
* @version 1.00
*/
public class Test2dArray {
	public static void main(String[] args) {
		String s[][] = new String[2][];
		
		s[0] = new String[2];  // ���ά�������ÿռ䣬�������䱣�����ݵ���ĳ���
		s[1] = new String[3];
		
		s[0][0] = new String("Good");  // ��Ϊ��ÿ������Ԫ�ص�������ռ�
		s[0][1] = new String("Luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		System.out.println(s[1][1]);
	}
}
