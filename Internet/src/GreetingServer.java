import java.net.*;
import java.io.*;

public class GreetingServer extends Thread{
	private ServerSocket serverSocket;
	
	public GreetingServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);  //创建绑定到特定端口的服务器套接字
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		while(true) {
			try {
				//返回此套接字在其上侦听的端口
				System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
				
				Socket server = serverSocket.accept(); //服务器获得一个 Socket 对象则通过 accept()方法的返回值
				System.out.println("远程主机地址："+server.getRemoteSocketAddress()); //指客户端的地址
				
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());  // 读取客户端传来的数据
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("谢谢你连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");  //响应给客户端
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
