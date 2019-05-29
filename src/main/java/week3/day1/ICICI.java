package week3.day1;

public class ICICI implements RBI,CIBIL {

	public void mandatoryAadhar() {
		System.out.println("Aadhar card is mandatory to create account in ICICI bank");	
	}
	public void noOfTransactions() {
		System.out.println("No. of transactions allowed per day:5");
	}
	public void cibilScore() {
		System.out.println("Cibil score is needed to get Credit card in ICICI bank");
	}
}