
import java.util.Scanner;
 
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // nextLine��ʽ�����ַ���
        System.out.println("nextLine��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("���������Ϊ��" + str2);
        }
        scan.close();
    }
}