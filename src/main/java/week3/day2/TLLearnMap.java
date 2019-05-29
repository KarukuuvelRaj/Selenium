package week3.day2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TLLearnMap {

	public static void main(String[] args) {
		
		String text = "Chennaii";
		char[] ch = text.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : ch) {
			 if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);  
			} else {
                map.put(c, 1);
			}
		}
		
		System.out.println(map); 
		
		
		
		
		
		
		
		
		
		
		/*Map<Integer, String> empList = new HashMap<>();
		empList.put(101, "gopi");
		empList.put(102, "sarath");
		empList.put(103, "koushik");
		empList.put(103, "balaji");
		empList.put(104, "balaji");
		
		for(Entry<Integer,String> eachEmp :  empList.entrySet()) {
			System.out.println(eachEmp.getKey()+" --> "+eachEmp.getValue());
		} */
		
		
		
		//System.out.println(empList.containsKey(101));
		//System.out.println(empList);
		
		
		
		/*System.out.println(empList);  
		System.out.println(empList.keySet());
		System.out.println(empList.values());
		System.out.println(empList.get(104));*/  

	}

}

