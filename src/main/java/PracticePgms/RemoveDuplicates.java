package PracticePgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		method1();
		method2();
	}
	static int[] data= {1,3,3,6,8,9,8,1,3};
	public static void method1() {
		Set<Integer> dup = new LinkedHashSet<Integer>();
		for(int i=0;i<data.length;i++) {
			for(int j=i+1; j<data.length;j++) {
				if(data[i]==data[j]) {
					dup.add(data[i]);
				}
			}
		}
		System.out.println(dup);
	}
	public static void method2() {
		int count=0,i,j;
		for(i=0;i<data.length;i++) {
			for(j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					count++;
				}
			}
			if(count==1) 
				System.out.println(data[i]);
			count=0;
		}
	}
}
