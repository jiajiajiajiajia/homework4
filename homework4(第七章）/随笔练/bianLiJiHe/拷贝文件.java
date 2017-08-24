package bianLiJiHe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ¿½±´ÎÄ¼þ {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File from = new File("F://io.txt");
		File to = new File("F://io2.txt");
		
		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);
		
		byte [] datas = new byte[in.available()];
		in.read(datas);
		String string=new String(datas ,"utf-8");
		out.write(string.getBytes());
		
		to.createNewFile();
		

	}

}
