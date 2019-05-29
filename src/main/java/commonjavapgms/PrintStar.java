package commonjavapgms;

public class PrintStar {

	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		int n=5,i,j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void method2() {
		int num,i,j,n=5;
		for (i=0; i < n; i++) {
			num=1;
			for (j=0;j<=i;j++) {
				System.out.println(num);
				num++;
			}
			System.out.println();
		}
	}
}
