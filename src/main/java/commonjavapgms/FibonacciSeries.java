package commonjavapgms;

public class FibonacciSeries {

	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		int a=0,b=1,i,c;
		System.out.println(a + " " + b);
		for (i = 2; i < 10; i++) {
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			System.out.println();
		}
	}
	public static void method2() {
		int a=0,b=1,i=1,n=10;
		System.out.println("First "+n +" numbers are: ");
		while (i<=n) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		}
	}
}
