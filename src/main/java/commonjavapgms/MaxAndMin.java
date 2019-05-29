package commonjavapgms;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMin {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
public static void method1() {
	int[] data = {12,64,90,557,8};
	int small=data[0];
	int large=data[0];
	for (int i = 0; i < data.length; i++) {
		if(data[i]>large) {
			large=data[i];
		}else if (data[i]<small) {
			small=data[i];
		}
	}
	System.out.println("Maximum is: "+large);
	System.out.println("Minimum is: "+small);
}
public static void method2() {
	int[] data2 = {63,90,99,53,89,12,75};
	Arrays.sort(data2);
	System.out.println("Maximum is: "+data2[data2.length-1]);
	System.out.println("Minimum is: "+data2[0]);
}
public static void method3() {
	Integer[] data3= {42,9,67,99,34,98};
	Integer max = Collections.max(Arrays.asList(data3));
	System.out.println("Maximum is: "+max);
	Integer min = Collections.min(Arrays.asList(data3));
	System.out.println("Minimum is: "+min);
}
}
