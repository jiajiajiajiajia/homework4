package ��������һ��828;

import java.util.Map;
import java.util.TreeMap;

public class �ַ����г��ִ���������ĸ {

	public static void main(String[] args) {
		String date = "qwertyuioyrwqwryuitrerrrtyufgyu";
		char [] a = date.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i=0;i<a.length;i++) {
			if (map.get(new Character(a[i]))==null) {
				//System.out.println(a[0]);
				map.put(new Character(a[i]),new Integer(1));//////�д�
				System.out.println(map.get(0));
			}
			else {
				Integer p = map.get(new Character(a[i]));
				map.put(new Character(a[i]),new Integer(p+1) );
			}
			System.out.println(map.get(i));
		}
			
		
	}

}
