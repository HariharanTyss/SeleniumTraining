package com.POMTestScripts;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.LearningMaven.generic.BaseTest;
import com.POMRepository.BooksPage;
import com.POMRepository.LoginPage;
import com.POMRepository.WelcomePage;

public class ValidateProductBookTest extends BaseTest
{
	@Test(dataProvider = "lgnData")
	public void validateproduct(String email,String pwd) 
	{
		WelcomePage wp=new WelcomePage(driver);
		LoginPage lp=new LoginPage(driver);
		BooksPage bp=new BooksPage(driver);
		
		wp.clicklogin();
		lp.enterEmail(email);
		lp.enterPassword(pwd);
		lp.clickLoginbutton();
		wp.clickBookslink();
		
		
		
		for(int i=0;i<4;i++) {
		
		bp.clickSortbydropdown(i);
		}
		
		bp.clickDisplaydropdown("12");
		
		

	}

}
