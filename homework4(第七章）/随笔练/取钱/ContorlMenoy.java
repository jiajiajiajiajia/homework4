package ȡǮ;

public class ContorlMenoy implements Runnable{

	private String name;
	public ContorlMenoy(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		Bank bank = new Bank();
		for(int i=0;i<5;i++) {
			System.out.println("�û�"+name+"ȡǮ��ʣ�ࣺ"+bank.getbalance());
		}
		
	}
	
}
