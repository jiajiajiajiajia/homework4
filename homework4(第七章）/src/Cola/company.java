package Cola;

public class company {
	public static void print2(colaEmployee a[]) {
		//输出某个组的人的工资，需要先建一个组
		for (int i=0; i<a.length;i++) {
			System.out.println("这个部门的第"+i+"名员工的工资为："+a[i].getSalary(1,2));
		}
		
	}
	public static void print2(colaEmployee a) {
		//输出某个人的工资,需要输入一个员工的名字
		System.out.println("(这是compary输出的)"+a.getName()+"的工资是："+ a.getSalary(1, 2));
	}

}
