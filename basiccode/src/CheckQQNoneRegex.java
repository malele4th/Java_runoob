/*
 * 非正则表达式方法：
 * 校验QQ，必须是5-15位数字，0不能开头
 * */
public class CheckQQNoneRegex {
    public static void main(String[] args) {
        checkQQ("123134");
    }
    public static void checkQQ(String qq)
    {
        int len = qq.length();
        if(len>=5 && len <=15)
        {
            if(!qq.startsWith("0"))
            {
                try
                {
                    long l = Long.parseLong(qq);
                    System.out.println("qq:"+l);
                }        
                catch (NumberFormatException e)
                {
                    System.out.println("出现非法字符");
                }
            }
            else
                System.out.println("不可以0开头");
        }
        else
            System.out.println("QQ号长度错误");
        }
}
