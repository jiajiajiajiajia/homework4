package ���ַ������ִ���;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ���ַ�����");
	    String a = scanner.next();
	    System.out.println("������һ�����ַ�����");
	    String b = scanner.next();
	    int count=0, start=0;
	    while (a.indexOf(b,start)>=0 && start+b.length()<a.length()) {
	    	count +=1;
	    	start=a.indexOf(b,start)+b.length();
	    }
	    System.out.println("���ַ�����Ԫ�ַ����г��ֵĴ���Ϊ��"+count);

	}

}
