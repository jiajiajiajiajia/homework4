package bianLiJiHe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ��һ������ {
	public static void main(String[] args) {
	List<String> list1=new ArrayList<String>(20);
	list1.add("a");
	list1.add("a");
	list1.add("a");
	list1.add("a");
	list1.add("a");
	list1.add("3");
	list1.add("1");
	list1.add("1");
	
	System.out.println("-------------------------------");
	ListIterator<String> listIterator1=list1.listIterator();
	System.out.println(listIterator1.hasPrevious());
	
	//˳��鿴
	while(listIterator1.hasNext()) {
		System.out.println("�� " +listIterator1.nextIndex() +" ��Ԫ�� : ֵ�� : "+listIterator1.next());
	}
	//����鿴
	while(listIterator1.hasPrevious()) {
		System.out.println(listIterator1.previousIndex()+":"+listIterator1.previous());
	}
	}
}
