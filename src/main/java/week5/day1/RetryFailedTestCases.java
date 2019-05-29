package week5.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	int count=0;
	int maxcount=2;
	public boolean retry(ITestResult result) {
		if(count<maxcount) {
			System.out.println("retrying " +result.getName()+ " again and the count is " + (count+1));
			count++;
			return true;
		}
		return false;
	}
}
