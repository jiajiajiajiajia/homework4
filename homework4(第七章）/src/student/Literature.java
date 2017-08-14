package student;

public class Literature extends student{
	
	public Literature(String name, char sex, int age,int sno,int speech,int FinalExam,int  Midsemester, int works) {
		super(name, sex, age,sno);
		this.FinalExam=FinalExam;
		this.speech=speech;
		this.works=works;
		this.Midsemester=Midsemester;
	}

	private int speech;
	private int FinalExam;
	private int Midsemester;
	private int works;
	

	
	@Override
	public double sumGrade() {
		grade=speech*0.35+works*0.35+FinalExam*0.15+Midsemester*0.15;
		return grade;
	}

}
