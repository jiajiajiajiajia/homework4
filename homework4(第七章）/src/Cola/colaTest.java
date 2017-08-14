package Cola;

public class colaTest {
	public static void main(String[] args) {
		colaEmployee emp1=new colaEmployee("Ô±¹¤1","1996-8-1",5000);
		emp1.print();
		company.print2(emp1);
		
		salariedEmployee emp2=new salariedEmployee();
		salariedEmployee emp3=new salariedEmployee();
		salariedEmployee emp4=new salariedEmployee();
		salariedEmployee []emps=new salariedEmployee[]{emp2,emp3,emp4};
		company.print2(emps);
		
		salesEmployee emp5=new salesEmployee( 80000,0.2);
		salesEmployee emp6=new salesEmployee(90000,0.3);
		salesEmployee emp7=new salesEmployee(70000,0.4);
		salesEmployee []emps2=new salesEmployee[]{emp5,emp6,emp7};
		company.print2(emps2);
		
		
	}

}
