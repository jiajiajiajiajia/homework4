package �ж������ַ�Ƿ�Ϸ�;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		System.out.println("������һ�������ַ��");
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
		//String a = "jia@139.com";
		char a1[]=a.toCharArray();
		int sumii=0;
		int sumiii=0;
		int ii=0;
		int iii=0;
		int i=0;
		int weizhi=0;
		for (;i<a.length();i++) {
			
			if (a1[i]=='@') {
				weizhi=i;
				sumii+=1;}
			else {
				if (i==a.length()-1 && sumii==0) {
				System.out.println("�����ַ���Ϸ�����Ϊȱ��@��");
				break;	
				}
			}}
			if (sumii==1) {
				ii=weizhi;
				}
			else if(sumii>1){System.out.println("��ַ���Ϸ����ж��@�ַ���"	);}
			
					
				
			int i2=0;
			int weizhi2=0;
		for (;i2<a.length();i2++) {
			if (a1[i2]=='.') {
				weizhi2=i2;
				sumiii+=1;}
			else  {
				if (i2==a.length()-1 && sumiii==0) {
					System.out.println("�����ַ���Ϸ�����Ϊȱ��'.'");
					break;	
					}
			}}
			if (sumiii==1) {
				iii=weizhi2;
			}
			else if(sumiii>1){ System.out.println("��ַ���Ϸ����ж��'.'�ַ���");}			
				
			if (iii>ii && ii>0 && iii>0) {
				//��substring
				String b = a.substring( 0, ii);
				String c = a.substring(ii+1,iii);
				System.out.println("������û��������ǣ�"+b+"������������Ϊ��"+c);
				//������ķ�ʽ��ȡ
//				char[] c=Arrays.copyOfRange( a1, 0, ii);
//				System.out.print("������û��������ǣ�");
//				for (int p=0;p<c.length;p++) {
//					System.out.print(c[p]);
//				}
//				char[] d=Arrays.copyOfRange( a1, ii+1, iii);
//				System.out.print("������������Ϊ��");
//				for (int p=0;p<d.length;p++) {
//					System.out.print(d[p]);
//				}
			}
			else if(iii<ii&&iii>0) {System.out.println("��ַ���Ϸ�����Ϊ'.'��@��ǰ�ߡ�");}
			
				
				
				
			
					
					
					
					
					
					
				
	
	}
			
			
		

}
