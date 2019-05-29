package commonjavapgms;

public class FindingAll {

	public static void main(String[] args) {
		fildAll();
	}
	static String test = "$$ Welcome to 1st Automation Interview $$";
	static char[] ch = test.toCharArray();
	static int letter=0, whiteSpace=0, digit=0, splChar=0;
	public static void fildAll() {
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isDigit(ch[i])) {
				digit++;
			}else if(Character.isWhitespace(ch[i])) {
				whiteSpace++;
			}else {
				splChar++;
			}
		}
		System.out.println("$$ Welcome to 1st Automation Interview $$ ");
		System.out.println("letter: " + letter);
		System.out.println("whiteSpace: " + whiteSpace);
		System.out.println("digit: " + digit);
		System.out.println("splChar: " + splChar);
		//System.out.println(ch);
	}
}
