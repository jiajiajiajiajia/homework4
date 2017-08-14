package student;

public class computer extends student{
	private int EnglishWriting;
	private int Operation;
	private int FinalExam;
	private int Midsemester;
	
	public computer(String name,char sex,int age,int sno,int EnglishWriting,int FinalExam,int  Midsemester,int Operation) {
		super(name, sex, age,sno);
		this.FinalExam=FinalExam;
		this.EnglishWriting=EnglishWriting;
		this.Midsemester=Midsemester;
		this.Operation=Operation;
	}
	
	public double sumGrade() {
		grade=EnglishWriting*0.4+Operation*0.2+FinalExam*0.2+Midsemester*0.2;
		return grade;
	}
	
}
