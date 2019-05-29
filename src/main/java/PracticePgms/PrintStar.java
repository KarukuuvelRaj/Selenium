package PracticePgms;

public class PrintStar {

	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void method2() {
		int n=4,num;
		for(int i=0;i<n;i++) {
			num=1;
			for(int j=0;j<=i;j++) {
				System.out.println(num);
				num++;
			}
			System.out.println();
		}
	}
}
