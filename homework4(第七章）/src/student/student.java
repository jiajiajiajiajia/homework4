package student;

public class student {
	private String name;
	private char sex;
	private int age;
	protected double grade;
	private int sno;
	public student() {
		
	}
	public student(String name,char sex,int age,int sno) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.sno=sno;
		
	}
	public void print(student [] student) {
		for (int i=0;i<student.length;i++) {
			System.out.println("姓名:"+student[i].getName()+"\t"+"年龄:"+student[i].getAge()+"\t"+"性别:"+student[i].getSex()+"\t"+"总成绩:"+student[i].sumGrade());
		}
		
		
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public double sumGrade() {
		return age;
		
	}
}
