package bianLiJiHe;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class jiajia {
	
	public static void main(String[] args) throws IOException {
		
		//���ʴ����ļ�
		File file = new File("c:/test/io.txt");
		File test = new File("c:/test");
		
		File io3 = new File("io3.txt");
		
		//�����ļ�
		File newFile = new File("c:/test/io2.txt");
		newFile.createNewFile();
		
		System.out.println("file �Ƿ���� : " + file.exists());
		System.out.println("file ���ļ� ? " + file.isFile());
		System.out.println("test ��Ŀ¼ ? " + test.isDirectory());
		System.out.println("test ���ļ� ? " + test.isFile());
		
		System.out.println("file length : " + file.length() + " �ֽ� ");
		System.out.println("file �����޸�ʱ���� : " + new Date( file.lastModified() ));
		
		System.out.println("file �Ƿ��д�� : " + file.canWrite());
		file.setWritable(true);
		System.out.println("file �Ƿ��д�� : " + file.canWrite());
		
		//�����ļ�
//		boolean flag = newFile.createNewFile();
		
		//lists
		File[] files = test.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
		
		
		System.out.println("io3 �ľ���·�� : " + io3.getAbsolutePath() );
		
		io3.delete();
		
		System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024 );
		
		System.out.println(file.getUsableSpace() / 1024 / 1024 / 1024 );
		
		File newFile2 = new File("F:\\Hbuilder���زֿ�");
		
		���һ���ļ����е����ļ���.listF(newFile2);
		
	}
	

}