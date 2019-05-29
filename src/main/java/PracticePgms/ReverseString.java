package PracticePgms;

public class ReverseString {

	public static void main(String[] args) {
		method1();
		method2();
		usingStringBuilder();
	}
	static String input = "Weather is very hot";
	public static void method1() {
		for(int i=input.length()-1;i>=0;i--)
			System.out.print(input.charAt(i));
		System.out.println();
	}
	public static void method2() {
		char[] charArray = input.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
			System.out.print(charArray[i]);
		System.out.println();
	}
	public static void usingStringBuilder() {
		StringBuilder build = new StringBuilder(input);
		System.out.println(build.reverse());
	}
}
