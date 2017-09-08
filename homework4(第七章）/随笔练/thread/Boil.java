package thread;

public class Boil implements Runnable{

	@Override
	public void run() {
		System.out.println("开始烧水.");
		try {
			Thread.sleep(6*1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("烧完了快来把我端下去。");
	}

}
