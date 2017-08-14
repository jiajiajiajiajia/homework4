package inforface;

import java.util.Scanner;

public class gardener implements InforfaceFruits{

	@Override
	public void scann() {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.next();
		String s2="苹果";
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
//		String s2="苹果";
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
