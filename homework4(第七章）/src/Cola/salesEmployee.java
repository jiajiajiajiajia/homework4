package Cola;

public class salesEmployee extends colaEmployee{
	private int salary;
	private int 月销售额;
	private double 提成率;
	public salesEmployee(int 月销售额,double 提成率 ) {
		this.提成率=提成率;
		this.月销售额=月销售额;
	}
	//按提成拿钱的工人
	
	public int getSalary(int month,int d) {//用的时候提取一下这是几月（month），然后跟员工的生日月份d比较
		if (month==d) {
			salary=(int) (月销售额*提成率+4000)+100;
			//System.out.println("他的工资为："+salary);
			return salary;
		}
		//System.out.println("他的工资为："+salary);
		else salary=(int) (月销售额*提成率+4000);
		return salary;
	}

	public int get月销售额() {
		return 月销售额;
	}

	public void set月销售额(int 月销售额) {
		this.月销售额 = 月销售额;
	}

	public double get提成率() {
		return 提成率;
	}

	public void set提成率(double 提成率) {
		this.提成率 = 提成率;
	}


	
	

}
