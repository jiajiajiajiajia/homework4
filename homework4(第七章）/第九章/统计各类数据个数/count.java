package ͳ�Ƹ������ݸ���;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count {

	public static void main(String[] args) {
		System.out.println("������һ���ַ���");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    int isDigit=0;
	    int isLetter=0;
	    //////////////////
	    //ʹ��isDigit�ж��Ƿ�Ϊ����
	    //ʹ��isLetter�ж��Ƿ�Ϊ��ĸ
	    
	    for (int i=0;i<a.length();i++) {
	    	if (Character.isDigit(a.charAt(i))) isDigit+=1;
	    	if (Character.isLetter(a.charAt(i))) isLetter+=1;
	    	
	    }
	    
	    String regex = "[\u4e00-\u9fff]"; 
	    int count = (" " + a + " ").split (regex).length - 1;
	    System.out.println("���ֵĸ����У�"+(isDigit)+"��ĸ�ĸ����ǣ�"+(isLetter-count));
	    System.out.print("���ֵĸ����ǣ�"+count);

	}
	
//////////�ж������ַ���
	public static boolean isContainChinese(String str) {
  		@SuppressWarnings("unused")
		int count=0;
  		
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

}
