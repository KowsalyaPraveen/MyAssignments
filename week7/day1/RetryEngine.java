package week7.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryEngine implements IRetryAnalyzer{

	int count =0; // 2
	int maxTry =2;
	@Override
	public boolean retry(ITestResult result) {
		if (count<maxTry) { // 2<2 --> false
			count++;
			return true;
		}
		
		return false;
	}

}