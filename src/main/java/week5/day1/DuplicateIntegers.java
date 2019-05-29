package week5.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateIntegers {

	//public static void main(String[] args) {
	int a[]= {1,3,3,7,8,8,9};
	@Test
	public void dupInt() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println("Duplicate Integers: "+a[i]);
				}
			}
		}}
	@Test
	public void sort() {
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] == a[i+1]) {
				System.out.println("Duplicate Integers: "+a[i]);
			}
		}
	}
	@Test
	public void set() {
		Set<Integer> dups = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(dups.add(a[i])==false) {
				System.out.println("Duplicate Integers: "+a[i]);
			}
		}
	}
}

