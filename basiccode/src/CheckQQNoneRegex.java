/*
 * ��������ʽ������
 * У��QQ��������5-15λ���֣�0���ܿ�ͷ
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
                    System.out.println("���ַǷ��ַ�");
                }
            }
            else
                System.out.println("������0��ͷ");
        }
        else
            System.out.println("QQ�ų��ȴ���");
        }
}
