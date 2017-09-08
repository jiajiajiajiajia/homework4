package 套接字;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class 客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("10.25.130.232",6666);
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		Scanner scan = new Scanner(System.in);
		
		while(true) {			
		

			
			String aString = scan.nextLine();
			out.write(aString.getBytes());
			
			byte [] b = new byte[100];
			in.read(b);
			String pString = new String(b);
			pString = pString.trim();
			System.out.println("服务端说: " + pString);
			
			
			if(pString.equals("baibai")||aString.equals("baibai")) {
				System.out.println("退出");
				socket.close();
				break;
			}
		}
		
 
	}

}
