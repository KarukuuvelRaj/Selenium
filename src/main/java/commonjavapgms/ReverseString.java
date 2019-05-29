package commonjavapgms;

public class ReverseString {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
	public static void method1() {
		String data= "Today is Monday";
		StringBuilder reverse = new StringBuilder(data);
		System.out.println(reverse.reverse());
	}
	public static void method2() {
		String data1 = "My name is Raj";
		char[] ch=data1.toCharArray();
		for (int i = ch.length-1; i>=0; i--) 
			System.out.print(ch[i]);
		System.out.println();
	}
	public static void method3() {
		String data3="Hello world";
		for(int i=data3.length()-1;i>=0;i--) 
			System.out.print(data3.charAt(i));
	}
	}

