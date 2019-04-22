/*
 * 正则表达式方法：
 * 校验QQ，必须是5-15位数字，0不能开头
 * */
public class CheckQQRegex {
    public static void main(String[] args) {
        checkQQ2("0123134");
	}
	public static void checkQQ2(String qq) {                                                            
	        String reg = "[1-9][0-9]{4,14}";                  
	        System.out.println(qq.matches(reg)?"合法qq":"非法qq");                                 
	}
}
