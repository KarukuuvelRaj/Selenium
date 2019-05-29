package week1.day2;

public class LearnMethodOverloading {
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
		LearnMethodOverloading overloading = new LearnMethodOverloading();
		float calculatedArea = overloading.calculateArea(6,10f);
		float calculatedArea1 = overloading.calculateArea(6,6f);
		int calculatedArea2 = overloading.calculateArea(9);
		System.out.println("Answer is:"+calculatedArea+"\n "+calculatedArea1+"\n "+calculatedArea2);
		/*System.out.println("Answer is:"+calculatedArea1);
		System.out.println("Answer is:"+calculatedArea2);*/
	}
}
