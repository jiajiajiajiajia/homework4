package four;

import java.util.Collection;
import java.util.HashMap;

public class four {
	public static void main(String[] args) {
		HashMap hashMap=new HashMap<>();
		hashMap.put("1", new chuhu(1,"tom",20000));
		hashMap.put("2", new chuhu(2,"tom",40000));
		
		Collection values = hashMap.values();
		System.out.println(hashMap.values().iterator().next());//不會只輸出金額
		
		System.out.println(hashMap);
		
	}

}
