package Cola;

import java.sql.Date;

public class colaEmployee {
	
//	SimpleDateFormat Date=new SimpleDateFormat("yyyy-mm-xx");
			
	protected String name;
	protected String birthday;
	private int salary;
	private company company;
	
	
	public company getCompany() {
		return company;
	}
	public void setCompany(company company) {
		this.company = company;
	}
	public String getBirthday() {
		return birthday;
	}
	public int getSalary() {
		return salary;
	}
	public colaEmployee(String name, String birthday,int salary) {
		this.name=name;
		this.birthday=birthday;
		this.salary=salary;
	}
	public colaEmployee() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
	public int getSalary(int month,int d) {//用的时候提取一下这是几月（month），然后跟员工的生日月份d比较
		if (month==d) {
			salary=salary+100;
			//System.out.println("(这是员工的大类输出的)他的工资为："+salary);
			return salary;
		}
		//System.out.println("(这是员工的大类输出的)他的工资为："+salary);
		return salary;
	}
	public void print() {
		System.out.println(name+"的生日是"+birthday+"。");
	}
	
	

}
