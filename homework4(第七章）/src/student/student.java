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
			System.out.println("����:"+student[i].getName()+"\t"+"����:"+student[i].getAge()+"\t"+"�Ա�:"+student[i].getSex()+"\t"+"�ܳɼ�:"+student[i].sumGrade());
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
