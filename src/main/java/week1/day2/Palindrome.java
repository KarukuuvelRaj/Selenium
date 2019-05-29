
package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String word = "MADAM";
		int length = word.length();
		System.out.println("The given word length is:"+length);
		char[] charArray = word.toCharArray();
		//System.out.println(charArray); 
		
		String matches ="";
		for(int i=charArray.length-1;i>=0;i--) {
			matches=matches+charArray[i];	
		}
		if (word.equals(matches)) {
			System.out.println("It is a Palindrome");
		}	
	}
}
