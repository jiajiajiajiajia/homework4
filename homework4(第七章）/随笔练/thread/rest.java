package thread;

public class rest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread t1Thread = new Thread(new Boil());
		t1Thread.start();
		Thread t2Thread = new Thread(new Wish());
		t2Thread.start();

	}

}
