import java.net.*;
import java.io.*;

public class GreetingClient {
	public static void main(String [] args) {
		String serverName = args[0];    // 服务器的名字和端口号
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("连接到主机：" + serverName + ", 端口号：" + port);
			Socket client = new Socket(serverName, port);  // 客户端要获取一个 Socket 对象通过实例化
			System.out.println("远程主机地址：" + client.getRemoteSocketAddress()); // 指服务器地址
			
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Hello from " + client.getLocalSocketAddress());  // 发送给服务器的数据
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("服务器响应： " + in.readUTF()); // 服务器响应过来的数据
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
