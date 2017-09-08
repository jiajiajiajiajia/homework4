package thread;

public class rest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread t1Thread = new Thread(new Boil());
		t1Thread.start();
		Thread t2Thread = new Thread(new Wish());
		t2Thread.start();

	}

}
