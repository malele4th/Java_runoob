
import java.util.Scanner;

//猜字符小游戏
public class GameGuessing {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        char[] chs = generate();
        System.out.println(chs);
        int count = 0; // 猜错的次数
        while (true) { // 自造死循环
            System.out.println("猜吧!");
            String str = scan.next().toUpperCase(); // 获取用户输入的字符串
            if (str.equals("EXIT")) { // 判断字符串内容相等
                System.out.println("下次再来吧!");
                break;
            }
            char[] input = str.toCharArray(); // 将字符串转换为字符数组
            int[] result = check(chs, input);
            if (result[0] == chs.length) { // 对
                int score = 100 * chs.length - 10 * count;
                System.out.println("恭喜你，猜对了!得分为:" + score);
                break;
            } else {
                count++;
                System.out.println("字符对个数为:" + result[1] + "，位置对个数为:" + result[0]);
            }
        }
    }
    // 生成随机字符数组chs
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

    // 对比:随机字符数组chs与用户输入的字符数组input
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
