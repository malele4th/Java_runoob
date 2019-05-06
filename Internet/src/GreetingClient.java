import java.net.*;
import java.io.*;

public class GreetingClient {
	public static void main(String [] args) {
		String serverName = args[0];    // �����������ֺͶ˿ں�
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("���ӵ�������" + serverName + ", �˿ںţ�" + port);
			Socket client = new Socket(serverName, port);  // �ͻ���Ҫ��ȡһ�� Socket ����ͨ��ʵ����
			System.out.println("Զ��������ַ��" + client.getRemoteSocketAddress()); // ָ��������ַ
			
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Hello from " + client.getLocalSocketAddress());  // ���͸�������������
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("��������Ӧ�� " + in.readUTF()); // ��������Ӧ����������
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
