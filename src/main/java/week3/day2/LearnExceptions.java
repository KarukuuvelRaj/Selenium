package week3.day2;
public class LearnExceptions {
public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000); 
		int age = 10;
		try {
		if (age<18) {
			 throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("the number should not be devided by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("age should be greater 18");  
		}
		finally {
			System.out.println("always runnable");  
		}
	}
}
