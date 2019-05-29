package week1.day2;

public class StringClass {

	public static void main(String[] args) {
		String companyName = "testLeaf Software";
		String replace = companyName.replace(" ", "");
		System.out.println(replace);
		char[] charArray = replace.toCharArray();
		System.out.println("First Character is:"+charArray[0]);
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[0]==charArray[i]) {
				count=count+1;
			}
		}
		System.out.println("List of First Character T is: "+count);	
	}
}
