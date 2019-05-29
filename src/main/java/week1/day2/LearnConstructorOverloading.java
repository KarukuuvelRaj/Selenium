package week1.day2;

public class LearnConstructorOverloading {
	public LearnConstructorOverloading() {
		/*this(10,5);*/
		System.out.println("no args");
	}
	public LearnConstructorOverloading(int a) {
		System.out.println("Single arg");
	}
	public LearnConstructorOverloading(int a, float b) {
		/*this();*/
		System.out.println("Two args");
	}
	public int calculateArea(int a) {
		return a*a;
	}
	public float calculateArea(int b, float c) {
		return  b*c;
	}
	public float calculateArea(int d,float e, float f) {
		return d*e*f;
	}
	public static void main(String[] args) {
		LearnConstructorOverloading overloading = new LearnConstructorOverloading();
		float calculatedArea = overloading.calculateArea(6,10f);
		float calculatedArea1 = overloading.calculateArea(6,6f);
		int calculatedArea2 = overloading.calculateArea(9);
		System.out.print("Answer is:"+calculatedArea+" "+calculatedArea1+" "+calculatedArea2);
		/*System.out.println("Answer is:"+calculatedArea1);
		System.out.println("Answer is:"+calculatedArea2);*/
	}
}
