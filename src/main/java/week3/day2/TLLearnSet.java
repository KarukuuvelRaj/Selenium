package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class TLLearnSet {
	public static void main(String[] args) {
		Set<String> allBicycles = new LinkedHashSet<String>();
		boolean add = allBicycles.add("hero");
		System.out.println(add);
		allBicycles.add("bsa");
		allBicycles.add("firefox");
		boolean add2 = allBicycles.add("hero");
		System.out.println(add2);
//		allBicycles.remove("hero");
		System.out.println(allBicycles.size());
		List<String> myCycles = new ArrayList<String>();
		myCycles.addAll(allBicycles);
		String firstCyc = myCycles.get(0);
		System.out.println(firstCyc);
	}
}

