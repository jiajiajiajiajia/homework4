package bianLiJiHe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 练一练方法 {
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
	
	//顺序查看
	while(listIterator1.hasNext()) {
		System.out.println("第 " +listIterator1.nextIndex() +" 个元素 : 值是 : "+listIterator1.next());
	}
	//逆序查看
	while(listIterator1.hasPrevious()) {
		System.out.println(listIterator1.previousIndex()+":"+listIterator1.previous());
	}
	}
}
