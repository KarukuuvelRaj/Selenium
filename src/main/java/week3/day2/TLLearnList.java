package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TLLearnList {
	public static void main(String[] args) {
		List<String> allBicycles = new ArrayList<String>();
		allBicycles.add("hero");
		allBicycles.add("bsa");
		allBicycles.add("hero");
		allBicycles.add(0, "firefox");
		allBicycles.remove("hero");
		System.out.println(allBicycles.size());
		for (String eachCycle : allBicycles) {
			System.out.println(eachCycle);
		}
		String lastCyc = allBicycles.get(allBicycles.size() -1);
//		System.out.println(lastCyc);
		boolean contains = allBicycles.contains("firefox1");
		System.out.println(contains);
//		allBicycles.clear();
		boolean empty = allBicycles.isEmpty();
		System.out.println(empty);
		Collections.sort(allBicycles);
		System.out.println(allBicycles);
	}
}
