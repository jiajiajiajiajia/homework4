package �ַ�����ֵ���;

import java.util.Scanner;

///////////////////////////////
//����Integer.parseInt(a)��aת��Ϊint��

public class addString {
	public static void main(String[] args) {
		System.out.println("��������������");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    String b = scanner.next();
	    int a1 = Integer.parseInt(a);//��aת��Ϊint��
	    int a2 = Integer.parseInt(b);
	    System.out.println("���ǵĺ�Ϊ��"+(a1+a2));
	    
	}

}
