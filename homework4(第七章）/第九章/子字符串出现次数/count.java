package 子字符串出现次数;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
	    String a = scanner.next();
	    System.out.println("请输入一个子字符串：");
	    String b = scanner.next();
	    int count=0, start=0;
	    while (a.indexOf(b,start)>=0 && start+b.length()<a.length()) {
	    	count +=1;
	    	start=a.indexOf(b,start)+b.length();
	    }
	    System.out.println("子字符串在元字符串中出现的次数为："+count);

	}

}
