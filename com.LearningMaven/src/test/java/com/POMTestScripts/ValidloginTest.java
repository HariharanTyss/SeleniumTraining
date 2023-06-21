package com.POMTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;
import com.POMRepository.BooksPage;
import com.POMRepository.LoginPage;
import com.POMRepository.ShoppingCartPage;
import com.POMRepository.WelcomePage;

public class ValidloginTest extends BaseTest
{

	@Test(dataProvider = "lgnData",priority = 2)
	public void validatelogin(String email,String pwd) 
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(email);
		lp.enterPassword(pwd);
		lp.clickLoginbutton();
		System.out.println("login Sucessful");
		
	}
	

}
