package commonjavapgms;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
		swapingWithout3rdVarible();
		swapingWithoutTempVarible();
		swapingWithout3rdVariable();
	}
	static int x = 10;
	static int y = 5;
	public static void swapingWithout3rdVarible(){ 
		System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}
	public static void swapingWithoutTempVarible(){
		System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}
	public static void swapingWithout3rdVariable() {
		System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);	
	}
}
