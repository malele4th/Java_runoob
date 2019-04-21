
import java.util.Scanner;

//���ַ�С��Ϸ
public class GameGuessing {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        char[] chs = generate();
        System.out.println(chs);
        int count = 0; // �´�Ĵ���
        while (true) { // ������ѭ��
            System.out.println("�°�!");
            String str = scan.next().toUpperCase(); // ��ȡ�û�������ַ���
            if (str.equals("EXIT")) { // �ж��ַ����������
                System.out.println("�´�������!");
                break;
            }
            char[] input = str.toCharArray(); // ���ַ���ת��Ϊ�ַ�����
            int[] result = check(chs, input);
            if (result[0] == chs.length) { // ��
                int score = 100 * chs.length - 10 * count;
                System.out.println("��ϲ�㣬�¶���!�÷�Ϊ:" + score);
                break;
            } else {
                count++;
                System.out.println("�ַ��Ը���Ϊ:" + result[1] + "��λ�öԸ���Ϊ:" + result[0]);
            }
        }
    }
    // ��������ַ�����chs
    public static char[] generate() {
        char[] chs = new char[5];
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        boolean[] flags = new boolean[letters.length];
        for (int i = 0; i < chs.length; i++) {
            int index;
            do {
                index = (int) (Math.random() * letters.length);
            } while (flags[index] == true);
            
            chs[i] = letters[index];
            flags[index] = true;
        }
        return chs;
    }

    // �Ա�:����ַ�����chs���û�������ַ�����input
    public static int[] check(char[] chs, char[] input) {
        int[] result = new int[2]; // (0,0)
        for (int i = 0; i < chs.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (chs[i] == input[j]) {
                    result[1]++;
                    if (i == j) {
                        result[0]++;
                    }
                    break;
                }
            }
        }
        return result;
    }
}
