package ����;

public class mimalei {
	
	public static void panduan (String a) {
	int count1 = 0,count2 = 0,count3 = 0,count4=0,count5=0;
    for (int i1=0;i1<a.length();i1++) {
    	if (Character.isDigit(a.charAt(i1))) count1+=1;
    	if (Character.isLowerCase(a.charAt(i1))) count2+=1;
    	if (Character.isUpperCase(a.charAt(i1))) count3+=1;
    	//�ж������ַ�
    	if (a.indexOf('~')>0||a.indexOf('!')>0||a.indexOf('@')>0
    			||a.indexOf('#')>0||a.indexOf('%')>0||a.indexOf('^')>0
    			||a.indexOf('(')>0||a.indexOf(')')>0)count5+=1;
    	//�жϺ���
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
    	System.out.println("��������ȼ��ܸ�Ŷ���ܰ�ȫ��A.");
    }
    else if(p==4||sum>12) {
    	System.out.println("��������ȼ�����������ʹ�á�B.");
    }else if(p==3){
    	System.out.println("��������ȼ��Ƚϵ͡������޸ġ�C.");
    }else  if(p==2){
    	System.out.println("��������ȼ�̫���ˡ�������ʹ�á�D.");
    }else {
    	System.out.println("�����Ϲ淶��E.");
    }

}
}
