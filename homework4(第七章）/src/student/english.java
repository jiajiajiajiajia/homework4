package student;

public class english extends student{
	private int speech;
	private int FinalExam;
	private int Midsemester;
	public english(String name,char sex,int age,int sno,int speech,int FinalExam,int  Midsemester) {
		super(name, sex, age,sno);
		this.FinalExam=FinalExam;
		this.speech=speech;
		this.Midsemester=Midsemester;
	}
	@Override
	public double sumGrade() {
		grade=speech*0.5+FinalExam*0.25+Midsemester*0.25;
		return grade;
	}

}
