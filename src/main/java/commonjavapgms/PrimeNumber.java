package commonjavapgms;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean prime = isPrime(18);
		System.out.println(prime);
		findingPrime();
	}
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0)
		
			return false;
	}
	return true;
}
public static void findingPrime() {
	int num = 17, count;

	for (int i = 1; i <= num; i++) {
		count = 0;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(i);
		}

	}
}
}
