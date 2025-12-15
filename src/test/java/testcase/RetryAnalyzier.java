package testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzier implements IRetryAnalyzer{
	
	int retrycount=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retrycount<2) {
			retrycount++;
			return false;
		}
		return false;
	}

}
