package ticket;

public class Demo01 {
	public static void main (String [] args) {
		
		SellThread t = new SellThread();
		
		Thread t1 = new Thread(t);
		t1.setName("��Ʊ�� 1 ");
		Thread t2 = new Thread(t);
		t2.setName("��Ʊ�� 2 ");
		Thread t3 = new Thread(t);
		t3.setName("��Ʊ�� 3 ");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class SellThread implements Runnable{

	
	int ticket = 100;
	@Override
	public void run() {
		
		int a = 0,b = 0,c = 0;
		while(true) {
			synchronized (this){
				if (ticket>0) {
					System.out.println(Thread.currentThread().getName()+":sell ticket:"+ticket);
					ticket--;
					if (Thread.currentThread().getName().equals("��Ʊ�� 1 ")) {
						a++;
					}
					if (Thread.currentThread().getName().equals("��Ʊ�� 2 ")) {
						b++;
					}
					if (Thread.currentThread().getName().equals("��Ʊ�� 3 ")) {
						c++;
					}
					
				}else {
					break;
				}

			}
			
		}
		int jiangjin1=5*(a/5);System.out.println("һ�Ŵ��ڵõ��Ľ����ǣ�"+jiangjin1+"������Ʊ���ǣ�"+a);
		int jiangjin2=5*(b/5);System.out.println("���Ŵ��ڵõ��Ľ����ǣ�"+jiangjin2+"������Ʊ���ǣ�"+b);
		int jiangjin3=5*(c/5);System.out.println("���Ŵ��ڵõ��Ľ����ǣ�"+jiangjin3+"������Ʊ���ǣ�"+c);
			
	}
	
}

