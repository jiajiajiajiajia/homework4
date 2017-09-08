package 考试题试一试828;

public class 字符串常用方法试一试 {

	public static void main(String[] args) {
		String aString = "abcdefcghic";
		System.out.println(aString.charAt(4));
		System.out.println(aString.indexOf("c"));
		System.out.println(aString.lastIndexOf("c"));
		System.out.println(aString.lastIndexOf("c", 9));
		System.out.println(aString.substring(2, 4));
		System.out.println(aString.compareTo("abcdefg"));
		System.out.println(aString.intern());//????什么鬼
		System.out.println(aString.hashCode());
		System.out.println(aString.format(aString,null));//????什么鬼
	}

}
