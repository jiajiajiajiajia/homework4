package bianLiJiHe;

import java.io.File;

public class 检测一个文件所有的子文件夹 {
	public static void listF(File file){
		  if(file.isDirectory()){
			  File[] files = file.listFiles();
			  if(files != null){
				  for(int i=0;i<files.length;i++){
					  listF(files[i]);
				  }
			  }
		  }
		  if(file != null){
			  System.out.println(file.getAbsolutePath());
		  }
	}
	public static void jiajia( File test) {
		File[] files = test.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
		jiajia(test);
	}

}
