package three;

import java.util.Iterator;
import java.util.TreeSet;

public class three {

	public static void main(String[] args) {
		TreeSet<Object> fruit = new TreeSet<>();
		fruit.add("apple");
		fruit.add("grape");
		fruit.add("pear");
		fruit.add("banana");
		
		
		Iterator<Object> Iter=fruit.iterator();
		while (Iter.hasNext()) {
			System.out.println(Iter.next());
		}
		System.out.println("��С���ǣ�"+fruit.first());
		System.out.println("�����ǣ�"+fruit.last());
		
	}
	

}
