package Ëæ±ãÁ·;

import java.util.Calendar;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class É¶ {
	public static void main(String[] args) {
		Calendar c =Calendar.getInstance();
		c.add(Calendar.HOUR, 2);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.HOUR));
		c.set(Calendar.HOUR,4);
		System.out.println(c.getTime());
		
		
 		
	}

}
