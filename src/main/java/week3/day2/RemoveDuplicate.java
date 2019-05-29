package week3.day2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "Goodday";
		String output = "";
		char[] charArray = input.toCharArray();
		/*List<Character> name = new ArrayList<Character>();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();*/
		Set<Character> setname = new LinkedHashSet<Character>();
		for (char c : charArray) {
			setname.add(c);
		}
		for (Character character : setname) {
			output+= character.charValue();
		}
System.out.println(output);
	}

}
