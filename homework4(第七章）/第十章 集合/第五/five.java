package 第五;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class five {

	public static void main(String[] args) {
		TreeSet<String> fruit = new TreeSet<>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入四个单词：");
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		String d = scan.nextLine();
		a.toLowerCase();
		b.toLowerCase();
		c.toLowerCase();
		d.toLowerCase();
		fruit.add(a);
		fruit.add(b);
		fruit.add(c);
		fruit.add(d);
		
			
		
		
		Iterator<String> Iter=fruit.iterator();
		while (Iter.hasNext()) {
			System.out.println(Iter.next());
		}
		
	}

}
