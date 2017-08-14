package student;

import java.util.ArrayList;

public class test {
	
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		
		student student1=new computer("小明",'男',21,1,90, 90, 90, 90);
		computer student2=new computer("小红",'女',20,2,90, 94, 98, 90);
		Literature student3=new Literature("小白",'女',20,3,99, 89, 88, 90);
		Literature student4=new Literature("aline",'男',20,4,90, 89,88,96);
		Literature student8=new Literature("小豆",'男',20,8,70, 89, 78, 76);
		Literature student9=new Literature("小黄",'男',20,9,70, 89, 78, 76);
		english student5=new english("小粉",'女',20,5,89, 88, 90);
		english student6=new english("小彩",'女',20,6,89, 88, 90);
		english student7=new english("小绿",'男',20,7,89, 88, 90);
		ArrayList<student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.add(student8);
		list.add(student9);
		System.out.println(list);
		
		java.util.Random random=new java.util.Random();// 定义随机类
		int r1=random.nextInt(9);
		int r2=random.nextInt(9);
		int r3=random.nextInt(9);
		int r4=random.nextInt(9);
		int r5=random.nextInt(9);
		System.out.print(r1+r2+r3+r4+r5);
		student students1=list.get(r1);
		student students2=list.get(r2);
		student students3=list.get(r3);
		student students4=list.get(r4);
		student students5=list.get(r5);
	

		
		
		
	    student[]student =new student [] {students1,students2,students3,students4,students5};
		student1.print(student);
		
		
		
	}

	
	
}
