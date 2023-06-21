package com.POMTestScripts;

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
		wp.clickBookslink();
		

		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(email);
		lp.enterPassword(pwd);
		lp.clickLoginbutton();
		SoftAssert st =new SoftAssert();
		
		
		
		BooksPage bp=new BooksPage(driver);
		bp.clickDisplaydropdown("Price: High to Low");
	}

}
