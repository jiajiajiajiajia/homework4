package ��������һ��828;

public class �ַ������÷�����һ�� {

	public static void main(String[] args) {
		String aString = "abcdefcghic";
		System.out.println(aString.charAt(4));
		System.out.println(aString.indexOf("c"));
		System.out.println(aString.lastIndexOf("c"));
		System.out.println(aString.lastIndexOf("c", 9));
		System.out.println(aString.substring(2, 4));
		System.out.println(aString.compareTo("abcdefg"));
		System.out.println(aString.intern());//????ʲô��
		System.out.println(aString.hashCode());
		System.out.println(aString.format(aString,null));//????ʲô��
	}

}
