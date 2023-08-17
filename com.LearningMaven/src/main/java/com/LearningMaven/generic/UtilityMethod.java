package com.LearningMaven.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POMRepository.BooksPage;
import com.POMRepository.LoginPage;
import com.POMRepository.WelcomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class UtilityMethod 
{
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static WebDriverWait explicitWait;
	public static String URL;
	public static String browserName;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Actions action;
	public static WelcomePage wp;
	public static LoginPage lp;
	public static BooksPage bp;
	
	String rpath="./Reports/reportName.html";

	public void initobjects() 
	{
		wp=new WelcomePage(driver);
	    lp=new LoginPage(driver);
		bp=new BooksPage(driver);
		 js=(JavascriptExecutor) driver;
		ts=(TakesScreenshot) driver;
	    action=new Actions(driver);
	    report=new ExtentReports(rpath);
	 
		
	}
	
	public static  String screenshot(int i) throws IOException 
	{
		String spath="./Screenshot/shot"+i+".png";
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(spath);
		FileHandler.copy(src, dest);
		
		return  "."+spath;
	}
	
	public void clicking() {
		System.out.println("Clicking from utility Method");
	}
}
