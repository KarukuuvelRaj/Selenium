package week1.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String name = "Karukkuvel";
		char[] charArray = name.toCharArray();
		//System.out.println(charArray[0]);
		
		for(int i=0;i<=charArray.length;i++) {
			char count=charArray[i];
			if(i%2==0) {
				count=Character.toUpperCase(count);
			}
			System.out.println(count);
		}
		
	}
}
