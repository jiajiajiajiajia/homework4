package ������;

import java.util.Scanner;

public class HuiWenShu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������һ�����֣�");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    char a1[]=a.toCharArray();
	    for (int i=0; i<a.length()/2;i++) {
	    	if (a1[0+i]==a1[a.length()-1-i]) {
	    		if(i>a.length()/2-2)
	    		System.out.println("��������");
	    	}
	    	else {
	    		System.out.println("���ǻ�������");
	    		break;
	    	}
	    		
	    }
	    

	}

}