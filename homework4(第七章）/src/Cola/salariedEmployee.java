package Cola;

public class salariedEmployee extends colaEmployee{
	//�������ʵ��˵�н�ʼ���
	
	public int salary=4000;

	public int getSalary(int month,int d) {//�õ�ʱ����ȡһ�����Ǽ��£�month����Ȼ���Ա���������·�d�Ƚ�
		if (month==d) {
			salary=salary+100;
			//System.out.println("(���ǵ�һ��Ա���������)���Ĺ���Ϊ��"+salary);
			return salary;
		}
		//System.out.println("(���ǵ�һ��Ա���������)���Ĺ���Ϊ��"+salary);
		return salary;
	}
	

}
