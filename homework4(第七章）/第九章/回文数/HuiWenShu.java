package 回文数;

import java.util.Scanner;

public class HuiWenShu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入一个数字：");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    char a1[]=a.toCharArray();
	    for (int i=0; i<a.length()/2;i++) {
	    	if (a1[0+i]==a1[a.length()-1-i]) {
	    		if(i>a.length()/2-2)
	    		System.out.println("回文数。");
	    	}
	    	else {
	    		System.out.println("不是回文数。");
	    		break;
	    	}
	    		
	    }
	    

	}

}