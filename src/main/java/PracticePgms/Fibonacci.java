package PracticePgms;

public class Fibonacci {

	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		int a=0,b=1,c;
		System.out.println(a + " " + b);
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			System.out.println();
		}
	}
	public static void method2() {
		int a=0,b=1,c,n=10,i=1;
		System.out.println("First "+ n + "number are:");	
		while(i<=n) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
}

