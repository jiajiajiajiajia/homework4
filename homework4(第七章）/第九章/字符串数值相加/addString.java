package 字符串数值相加;

import java.util.Scanner;

///////////////////////////////
//用了Integer.parseInt(a)将a转型为int型

public class addString {
	public static void main(String[] args) {
		System.out.println("请输入两个数：");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    String b = scanner.next();
	    int a1 = Integer.parseInt(a);//将a转型为int型
	    int a2 = Integer.parseInt(b);
	    System.out.println("他们的和为："+(a1+a2));
	    
	}

}
