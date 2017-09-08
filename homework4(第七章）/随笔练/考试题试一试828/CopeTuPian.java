package 考试题试一试828;
//复制图片的过程
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class CopeTuPian {

	public static void main(String[] args) throws IOException {
		
		InputStream f1=new FileInputStream("f:\\转换图.PNG");		
		BufferedInputStream bInputStream=new BufferedInputStream(f1);
		
		File file = new File("f:\\转换2.PNG");
		OutputStream f2=new FileOutputStream(file);		
		BufferedOutputStream bOutputStream=new BufferedOutputStream(f2);
		
		//long start=System.nanoTime();
		
		byte[] datas = new byte[f1.available()];

		bInputStream.read(datas);

		bOutputStream.write(datas);
		file.createNewFile();
		
		//long end=System.nanoTime();
		
		//System.out.println((end-start)/1000);

	}

}
