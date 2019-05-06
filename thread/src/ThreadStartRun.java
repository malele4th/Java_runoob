
public class ThreadStartRun {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        Thread thread1 = new Thread(runner1); // Thread(Runnable target) 分配新的 Thread 对象。
        Thread thread2 = new Thread(runner2);
        thread1.start();
        thread2.start();
//        thread1.run();  // 如果不调用start()，调用run()，顺序执行，先执行thread1，然后再执行thread2
//        thread2.run();
    }

}
class Runner1 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("进入Runner1运行状态——————————" + i);
        }
    }
}
 
class Runner2 implements Runnable { 
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("进入Runner2运行状态——————————" + i);
        }
    }
}