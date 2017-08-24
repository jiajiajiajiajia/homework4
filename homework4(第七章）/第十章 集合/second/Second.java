package second;

import java.util.ArrayList;

public class Second {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(5);
		arr.iterator();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)); 
		}
		System.out.println();
		arr.sort(null);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)); 
		}
	}

}
