package Cola;

public class salariedEmployee extends colaEmployee{
	//拿死工资的人的薪资计算
	
	public int salary=4000;

	public int getSalary(int month,int d) {//用的时候提取一下这是几月（month），然后跟员工的生日月份d比较
		if (month==d) {
			salary=salary+100;
			//System.out.println("(这是第一类员工类输出的)他的工资为："+salary);
			return salary;
		}
		//System.out.println("(这是第一类员工类输出的)他的工资为："+salary);
		return salary;
	}
	

}
