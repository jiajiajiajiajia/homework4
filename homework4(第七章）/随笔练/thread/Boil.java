package thread;

public class Boil implements Runnable{

	@Override
	public void run() {
		System.out.println("��ʼ��ˮ.");
		try {
			Thread.sleep(6*1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("�����˿������Ҷ���ȥ��");
	}

}
