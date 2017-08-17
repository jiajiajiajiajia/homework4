package 判断e出现的次数;

import java.util.Scanner;

//////////////////////
//用了a.toCharArray();


public class panduan {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串：");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    char a1[]=a.toCharArray();
	    int sum=0;
	    for (int i=0;i<a.length();i++) {
	    	if (a1[i]=='e')sum+=1;
	    	else continue;
	    }
	    System.out.println(sum);
	}

}
