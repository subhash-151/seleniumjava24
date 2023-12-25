package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("on test started:"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
	
		System.out.println("on test success:"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure:"+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped:"+result.getName());
		
	}
	public void onStart(ITestResult result) {
		System.out.println("on test started now:"+result.getName());
	}
	
	
	
	

}
