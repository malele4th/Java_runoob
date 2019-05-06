import java.net.*;
import java.io.*;

public class GreetingServer extends Thread{
	private ServerSocket serverSocket;
	
	public GreetingServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);  //�����󶨵��ض��˿ڵķ������׽���
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		while(true) {
			try {
				//���ش��׽��������������Ķ˿�
				System.out.println("�ȴ�Զ�����ӣ��˿ں�Ϊ��" + serverSocket.getLocalPort() + "...");
				
				Socket server = serverSocket.accept(); //���������һ�� Socket ������ͨ�� accept()�����ķ���ֵ
				System.out.println("Զ��������ַ��"+server.getRemoteSocketAddress()); //ָ�ͻ��˵ĵ�ַ
				
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());  // ��ȡ�ͻ��˴���������
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("лл�������ң�" + server.getLocalSocketAddress() + "\nGoodbye!");  //��Ӧ���ͻ���
				server.close();
			}
			catch(SocketTimeoutException s)
			{
				System.out.println("Socket timed out!");
				break;
			}
			catch(IOException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String [] args) {
		int port = Integer.parseInt(args[0]);
		try {
			Thread t = new GreetingServer(port);
			t.run();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
