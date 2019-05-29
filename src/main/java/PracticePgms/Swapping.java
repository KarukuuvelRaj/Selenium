package PracticePgms;

public class Swapping {

	public static void main(String[] args) {
method1();
method2();
method3();
	}
	static int x=50;
	static int y=60;
public static void method1() {
	System.out.println("Before Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println("After Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
}
public static void method2() {
	System.out.println("Before Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
	x=x*y;
	y=x/y;
	x=x/y;
	System.out.println("After Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
}
public static void method3() {
	System.out.println("Before Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swap:");
	System.out.println("X value is: "+x);
	System.out.println("Y value is: "+y);
}
}
