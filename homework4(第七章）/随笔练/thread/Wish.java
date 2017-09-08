package thread;

public class Wish extends Thread{
	@Override
	public void run() {
		System.out.println("开始洗杯子。");
		for (int i = 1; i < 6; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("第"+i+"个杯子洗完了。快夸我。");
		}
		
		
	}

}
