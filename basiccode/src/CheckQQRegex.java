/*
 * ������ʽ������
 * У��QQ��������5-15λ���֣�0���ܿ�ͷ
 * */
public class CheckQQRegex {
    public static void main(String[] args) {
        checkQQ2("0123134");
	}
	public static void checkQQ2(String qq) {                                                            
	        String reg = "[1-9][0-9]{4,14}";                  
	        System.out.println(qq.matches(reg)?"�Ϸ�qq":"�Ƿ�qq");                                 
	}
}
