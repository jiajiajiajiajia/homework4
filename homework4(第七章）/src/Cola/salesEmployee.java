package Cola;

public class salesEmployee extends colaEmployee{
	private int salary;
	private int �����۶�;
	private double �����;
	public salesEmployee(int �����۶�,double ����� ) {
		this.�����=�����;
		this.�����۶�=�����۶�;
	}
	//�������Ǯ�Ĺ���
	
	public int getSalary(int month,int d) {//�õ�ʱ����ȡһ�����Ǽ��£�month����Ȼ���Ա���������·�d�Ƚ�
		if (month==d) {
			salary=(int) (�����۶�*�����+4000)+100;
			//System.out.println("���Ĺ���Ϊ��"+salary);
			return salary;
		}
		//System.out.println("���Ĺ���Ϊ��"+salary);
		else salary=(int) (�����۶�*�����+4000);
		return salary;
	}

	public int get�����۶�() {
		return �����۶�;
	}

	public void set�����۶�(int �����۶�) {
		this.�����۶� = �����۶�;
	}

	public double get�����() {
		return �����;
	}

	public void set�����(double �����) {
		this.����� = �����;
	}


	
	

}
