package 套接字;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class 服务器端 {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		System.out.println("服务器启动了");
		
		Socket socket = server.accept();
		System.out.println("有人访问");
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			byte [] b = new byte[100];
			in.read(b);
			String pString = new String(b);
			pString = pString.trim();
			System.out.println("服务端说: " + pString);
			
			
		
			
			String aString = scan.nextLine();
			out.write(aString.getBytes());
			
			
			if(pString.equals("baibai")||aString.equals("baibai")) {
				
				socket.close();
				System.out.println("已退出");
				break;
			}
		}
		
		

	}

}
