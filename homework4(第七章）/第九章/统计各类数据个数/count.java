package 统计各类数据个数;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count {

	public static void main(String[] args) {
		System.out.println("请输入一串字符：");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
	    String a = scanner.next();
	    int isDigit=0;
	    int isLetter=0;
	    //////////////////
	    //使用isDigit判断是否为数字
	    //使用isLetter判断是否为字母
	    
	    for (int i=0;i<a.length();i++) {
	    	if (Character.isDigit(a.charAt(i))) isDigit+=1;
	    	if (Character.isLetter(a.charAt(i))) isLetter+=1;
	    	
	    }
	    
	    String regex = "[\u4e00-\u9fff]"; 
	    int count = (" " + a + " ").split (regex).length - 1;
	    System.out.println("数字的个数有："+(isDigit)+"字母的个数是："+(isLetter-count));
	    System.out.print("汉字的个数是："+count);

	}
	
//////////判断中文字符：
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
