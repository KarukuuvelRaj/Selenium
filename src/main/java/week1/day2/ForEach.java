package week1.day2;

public class ForEach {

	public static void main(String[] args) {
		int num[]= {1,3,5,2,4};
		//int f=1;
		for (int i : num) {
			if(i%2!=0) {
				/*f=f*i;*/
				System.out.println(i);
			}
		}
		/*System.out.println(f);*/
	}
}
