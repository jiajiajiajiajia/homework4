package Cola;

public class company {
	public static void print2(colaEmployee a[]) {
		//���ĳ������˵Ĺ��ʣ���Ҫ�Ƚ�һ����
		for (int i=0; i<a.length;i++) {
			System.out.println("������ŵĵ�"+i+"��Ա���Ĺ���Ϊ��"+a[i].getSalary(1,2));
		}
		
	}
	public static void print2(colaEmployee a) {
		//���ĳ���˵Ĺ���,��Ҫ����һ��Ա��������
		System.out.println("(����compary�����)"+a.getName()+"�Ĺ����ǣ�"+ a.getSalary(1, 2));
	}

}
