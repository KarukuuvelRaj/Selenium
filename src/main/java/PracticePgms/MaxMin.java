package PracticePgms;

import java.util.Arrays;
import java.util.Collections;

public class MaxMin {

	public static void main(String[] args) {
		method1();
		usingArraySort();
		usingCollections();
	}
	static Integer[] data = {15,34,99,456,8,0,7,1,78,56};
	public static void method1() {
		int large = data[0];
		int small = data[0];
		for(int i=0; i<data.length; i++) {
			if(data[i]>large) {
				large=data[i];
			} else if(data[i]<small) {
				small=data[i];
			}
		}
		System.out.println("Largest number is: "+large);
		System.out.println("Smallest number is: "+small);
	}
	public static void usingArraySort() {
		Arrays.sort(data);
		System.out.println("Largest number is: "+data[data.length-1]);
		System.out.println("Smallest number is: "+data[0]);
	}
	public static void usingCollections() {
		Integer max = Collections.max(Arrays.asList(data));
		Integer min = Collections.min(Arrays.asList(data));
		System.out.println("Largest number is: "+max);
		System.out.println("Smallest number is: "+min);
	}
}
