package thread;

public class Wish extends Thread{
	@Override
	public void run() {
		System.out.println("��ʼϴ���ӡ�");
		for (int i = 1; i < 6; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("��"+i+"������ϴ���ˡ�����ҡ�");
		}
		
		
	}

}
