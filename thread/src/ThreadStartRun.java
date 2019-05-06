
public class ThreadStartRun {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        Thread thread1 = new Thread(runner1); // Thread(Runnable target) �����µ� Thread ����
        Thread thread2 = new Thread(runner2);
        thread1.start();
        thread2.start();
//        thread1.run();  // ���������start()������run()��˳��ִ�У���ִ��thread1��Ȼ����ִ��thread2
//        thread2.run();
    }

}
class Runner1 implements Runnable { // ʵ����Runnable�ӿڣ�jdk��֪���������һ���߳�
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("����Runner1����״̬��������������������" + i);
        }
    }
}
 
class Runner2 implements Runnable { 
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("����Runner2����״̬��������������������" + i);
        }
    }
}