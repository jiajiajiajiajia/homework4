package ��������һ��828;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class copyFile {

	
	public static void main(String[] args) throws Exception {
		File from = new File("f:\\IO.txt");
		File to = new File("f:\\io2.txt");
		
		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);
		
		byte[] datas = new byte[in.available()];
		
		in.read(datas);
		
		String str = new String(datas , "utf-8");
		
		out.write(str.getBytes());
		to.createNewFile();
		
	
	}

}
