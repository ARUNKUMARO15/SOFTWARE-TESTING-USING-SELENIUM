package day9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class javaday9task4listener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		System.out.println("onTestStart"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
		System.out.println("onTestSuccess"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
		System.out.println("onTestFailure"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
		System.out.println("onTestSkipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println("onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println("onTestFailedWithTimeout"+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
		System.out.println("onStart"+context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context)
		System.out.println("onFinish"+context.getName());
	}
	
}
