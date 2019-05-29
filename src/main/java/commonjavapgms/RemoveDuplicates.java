package commonjavapgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		usingSet();
		usingLoop();
	}
public static void usingSet() {
	int[] array= {1,3,3,5,6,6,7,7,7};
	Set<Integer> duplicate = new LinkedHashSet<Integer>();
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				duplicate.add(array[i]);
			}
		}
	}
	System.out.println(duplicate);
}
public static void usingLoop() {
	int[] array= {1,3,3,5,6,6,7,7,7};
	int count=0;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[j]==array[i]) {
				count++;
			}
		}
		if(count==1)
			System.out.println(array[i]);
		count=0;
	}
}
}
