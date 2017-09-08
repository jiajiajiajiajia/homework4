package 考试题试一试828;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_shipin {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("F://85.wmv");
		BufferedInputStream bufferIn = new BufferedInputStream(in);
		
		File file = new File("F://87.wmv");
		FileOutputStream out = new FileOutputStream(file);
		BufferedOutputStream bufferOut = new BufferedOutputStream(out);
		int date;
		//long start = System.nanoTime();
		
		//这样复制的文件不完整
//		while ((date=bufferIn.read())!=-1) {
//			bufferOut.write(date);
//		}
		//正确复制方法
		byte[] datas = new byte[in.available()];
		in.read(datas);
		out.write(datas);
		file.createNewFile();
		
		
		
		
		//long end = System.nanoTime();
		//long time = ( end - start ) / 1000000 ;
		//System.out.println(time);


	}

}
