package �����;

import java.sql.Array;
import java.util.Arrays;

public class ��������� {

	public static void main(String[] args) {
		
		java.util.Random random=new java.util.Random();// ���������
		int arr[]=new int[10];
		arr[0]=random.nextInt(101);// ����[0,101)�����е�������ע�ⲻ����100
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
