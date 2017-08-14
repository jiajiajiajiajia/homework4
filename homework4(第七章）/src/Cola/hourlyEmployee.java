package Cola;

public class hourlyEmployee extends colaEmployee{
	private int salary;
	private int hours;
	private int salaryHours;
	//按小时计费的工人的工资
	public hourlyEmployee(int hours,int salaryHours) {
		this.hours=hours;
		this.salaryHours=salaryHours;
	}
	public int salary() {
	    salary = hours*salaryHours;
		return salary;
		
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getSalaryHours() {
		return salaryHours;
	}

	public void setSalaryHours(int salaryHours) {
		this.salaryHours = salaryHours;
	}

	public int getSalary(int month,int d) {//用的时候提取一下这是几月（month），然后跟员工的生日月份d比较
		if (month==d) {
			 salary = hours*salaryHours+100;
			return salary;
		}
		else  salary = hours*salaryHours;
		return salary;
	}


	
	

}
