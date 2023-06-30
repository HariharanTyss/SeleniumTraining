package com.POMTestScripts;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.LearningMaven.generic.BaseTest;
import com.LearningMaven.generic.UtilityMethod;
import com.POMRepository.BooksPage;
import com.POMRepository.LoginPage;
import com.POMRepository.WelcomePage;
import com.relevantcodes.extentreports.LogStatus;

public class ValidateProductBook extends BaseTest
{
	@Test(dataProvider = "lgnData")
	public void validateproduct(String email,String pwd) throws IOException 
	{
		
		test=report.startTest("ValidateProduct");
		
		test.log(LogStatus.INFO, "Demo Web Shop website open Sucessful");
		//clicking the login link present in WelcomPage
		wp.clicklogin();
				
		
		//Enter login credentials
		lp.enterEmail(email);
		lp.enterPassword(pwd);
		lp.clickLoginbutton();
		
		test.log(LogStatus.PASS, "login Sucessful");
		//click on Books Link
		wp.clickBookslink();
		
		test.log(LogStatus.PASS, "sucefully clicked books link");
		
		//click on each option on Sortby Dropdown
		for(int i=0;i<6;i++)
		{
		
		bp.clickSortbydropdown(i);
		test.log(LogStatus.PASS, "Sucessfuly "+i+"th index clicked");
		test.log(LogStatus.INFO,test.addScreenCapture(screenshot(i)));//
		
		}
	
		report.endTest(test);
		report.flush();
		
		

	}

}
