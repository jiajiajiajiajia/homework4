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
	public int getSalary(int month,int d) {//�õ�ʱ����ȡһ�����Ǽ��£�month����Ȼ���Ա���������·�d�Ƚ�
		if (month==d) {
			salary=salary+100;
			//System.out.println("(����Ա���Ĵ��������)���Ĺ���Ϊ��"+salary);
			return salary;
		}
		//System.out.println("(����Ա���Ĵ��������)���Ĺ���Ϊ��"+salary);
		return salary;
	}
	public void print() {
		System.out.println(name+"��������"+birthday+"��");
	}
	
	

}
