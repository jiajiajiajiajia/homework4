package 随机数;

import java.sql.Array;
import java.util.Arrays;

public class 随机数排列 {

	public static void main(String[] args) {
		
		java.util.Random random=new java.util.Random();// 定义随机类
		int arr[]=new int[10];
		arr[0]=random.nextInt(101);// 返回[0,101)集合中的整数，注意不包括100
		arr[1]=random.nextInt(101);
		arr[2]=random.nextInt(101);
		arr[3]=random.nextInt(101);
		arr[4]=random.nextInt(101);
		arr[5]=random.nextInt(101);
		arr[6]=random.nextInt(101);
		arr[7]=random.nextInt(101);
		arr[8]=random.nextInt(101);
		arr[9]=random.nextInt(101);
		
	    Arrays.sort(arr);
	    for (int i=0;i<arr.length;i++) {
	    	 System.out.println(arr[i]);
	    }
	   

	}

}
