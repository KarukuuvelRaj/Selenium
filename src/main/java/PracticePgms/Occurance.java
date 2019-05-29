package PracticePgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		usingMap();
		method2();
	}
	static String data = "welcome to automation";
	public static void usingMap() {
		char[] charArray = data.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	public static void method2() {
		int c=0;
		char charAt = data.charAt(4);
		for(int i=0;i<data.length();i++) {
			if(charAt==data.charAt(i))
				c++;
		}
		System.out.println(charAt + " occurs " + c + " times ");
	}
}