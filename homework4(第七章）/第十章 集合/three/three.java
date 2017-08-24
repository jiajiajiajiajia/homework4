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
		System.out.println("最小的是："+fruit.first());
		System.out.println("最大的是："+fruit.last());
		
	}
	

}
