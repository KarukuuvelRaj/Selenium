package week3.day1;

public class MainMethod {

	public static void main(String[] args) {
		ICICI iciciobj=new ICICI();
		iciciobj.cibilScore();
		iciciobj.mandatoryAadhar();
		iciciobj.noOfTransactions();
		SBI sbiobj=new SBI();
		sbiobj.mandatoryAadhar();
		sbiobj.noOfTransactions();
		System.out.println("The number is: "+iciciobj.num);
	}
}
