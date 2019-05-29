package PracticePgms;

public class FindingAll {

	public static void main(String[] args) {
		method1();
	}
	static String input = " $$ Welcome to 1st Automation Interview $$ ";
	public static void method1() {
		int letter=0, digit=0, space=0, splchar=0;
		char[] charArray = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if(Character.isLetter(charArray[i])) {
				letter++;
			}else if (Character.isDigit(charArray[i])) {
				digit++;
			}else if(Character.isWhitespace(charArray[i])){
				space++;
			}else {
				splchar++;
			}
		}
		System.out.println("No.of Letter is: "+letter);
		System.out.println("No.of Digit is: "+digit);
		System.out.println("No.of Space is: "+space);
		System.out.println("No.of SplChar is: "+splchar);
	}
}
