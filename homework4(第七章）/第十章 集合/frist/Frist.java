package frist;

import java.util.LinkedList;

public class Frist {
	LinkedList<String> aaa;
	public Frist() {
		 aaa = new LinkedList<String>();
	}
	public LinkedList<String> put(String o) {
		
		aaa.add(o);
		return aaa;
	}
	public String get(int o) {
		return aaa.get(o);
	}
	public boolean isEmpty() {
		if(aaa.isEmpty())
			return true;
		else return false;
		
	}

}
