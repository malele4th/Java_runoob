/*
 *  把给定的数字以二进制形式写进该文件，同时输出到控制台上。
 *  由于是二进制写入，存在乱码
 * */
import java.io.*;
 
public class FileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();
 
            InputStream is = new FileInputStream("test.txt");
            int size = is.available(); //返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数
 
            for (int i = 0; i < size; i++) {
                //System.out.print((char) is.read() + "  ");  // 乱码
                System.out.print((byte) is.read() + "  ");    // 强制转换为byte类型就好了
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}