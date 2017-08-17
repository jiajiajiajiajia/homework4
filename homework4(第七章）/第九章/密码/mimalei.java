package 密码;

public class mimalei {
	
	public static void panduan (String a) {
	int count1 = 0,count2 = 0,count3 = 0,count4=0,count5=0;
    for (int i1=0;i1<a.length();i1++) {
    	if (Character.isDigit(a.charAt(i1))) count1+=1;
    	if (Character.isLowerCase(a.charAt(i1))) count2+=1;
    	if (Character.isUpperCase(a.charAt(i1))) count3+=1;
    	//判断特殊字符
    	if (a.indexOf('~')>0||a.indexOf('!')>0||a.indexOf('@')>0
    			||a.indexOf('#')>0||a.indexOf('%')>0||a.indexOf('^')>0
    			||a.indexOf('(')>0||a.indexOf(')')>0)count5+=1;
    	//判断汉字
    	String regex = "[\u4e00-\u9fff]"; 
	    count4= (" " + a + " ").split (regex).length - 1;
    }
    int sum=count1+count2+count3+count4+count5;
   // System.out.println(count1+" "+count2+" "+count3+" "+count4+" "+count5);
    int b[]=new int[] {count1,count2,count3,count4,count5};
    int p=0;
    for( int i = 0;i<b.length;i++) {
    	if (b[i]>0) {
    		p+=1;
    	}
    }
    if (p==5||sum>15) {
    	System.out.println("您的密码等级很高哦。很安全。A.");
    }
    else if(p==4||sum>12) {
    	System.out.println("您的密码等级还不错，可以使用。B.");
    }else if(p==3){
    	System.out.println("您的密码等级比较低。建议修改。C.");
    }else  if(p==2){
    	System.out.println("您的密码等级太低了。不建议使用。D.");
    }else {
    	System.out.println("不符合规范，E.");
    }

}
}
