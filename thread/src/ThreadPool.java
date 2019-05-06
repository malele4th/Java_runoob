import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //�����̳߳ض���  ����5��������5���̵߳��̳߳�
        ExecutorService service = Executors.newFixedThreadPool(5);
        
        //����Runnable�߳��������
        TaskRunnable task = new TaskRunnable();
        
        //���̳߳��л�ȡ�̶߳���
        service.submit(task);
        
        //�ٻ�ȡһ���̶߳���
        service.submit(task);
        
        //�ر��̳߳�
        service.shutdown();
    }

}

class TaskRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("�Զ����߳�������ִ��"+i);
        }
    }
}