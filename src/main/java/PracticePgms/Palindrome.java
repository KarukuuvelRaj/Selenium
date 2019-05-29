package PracticePgms;

public class Palindrome {

	public static void main(String[] args) {
		method1();
	}
	static String str = "MADAM";
	public static void method1() {
		char[] charArray = str.toCharArray();
		String matches="";
		for(int i=str.length()-1;i>=0;i--) {
			matches=matches+charArray[i];
		}
		System.out.println(matches);
		if(str.equals(matches)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not a Palindrome");
	}
}
