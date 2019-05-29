
package commonjavapgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		usingMap();
		occuranceOfString();
	}
	static String str = "welcome to automation";
	public static void usingMap() {
		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new LinkedHashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);
	}
	public static void occuranceOfString() {
		char c = str.charAt(4);
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(c + " occurs " + count + " times in " + str);
	}
}

