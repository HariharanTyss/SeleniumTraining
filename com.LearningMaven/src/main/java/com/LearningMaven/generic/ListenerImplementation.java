package com.LearningMaven.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testcase Started");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" has Skipped ");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Executed Sucessful");
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String testname = result.getName();
		TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+testname+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution Finished ");
	}

}
