package inforface;

import java.util.Scanner;

public class gardener implements InforfaceFruits{

	@Override
	public void scann() {
		// TODO �Զ����ɵķ������
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.next();
		String s2="ƻ��";
		if (s1.equals(s2)) {
			//System.out.println(s1);
			apple apple=new apple();
		}else if (s1.equals("banana")) {
			banana banana=new banana();
		}else if (s1.equals("grape")){
			grape grape=new grape();
		}
		
	}
//	@Override
//	public void scann() {
//		Scanner scanner=new Scanner(System.in);
//		String s1=scanner.next();
//		//System.out.println(s1);
//		String s2="ƻ��";
//		if (s1==s2) {
//			//System.out.println(s1);
//			apple apple=new apple();
//		}else if (s1=="banana") {
//			banana banana=new banana();
//		}else  if (s1=="grape"){
//			grape grape=new grape();
//		}
//	}

}
