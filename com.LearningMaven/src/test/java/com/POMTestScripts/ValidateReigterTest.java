package com.POMTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;
import com.POMRepository.BooksPage;
import com.POMRepository.LoginPage;
import com.POMRepository.RegisterPage;
import com.POMRepository.WelcomePage;

public class ValidateReigterTest extends BaseTest
{
	@Test(dataProvider = "rgstrdata",priority = 1)
	public void validateregister(String fnm, String lnm,String email,String pwd,String cpwd) 
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.clickregisterlink();
		RegisterPage rp=new RegisterPage(driver);
		rp.clickMaleRadiobutton();
		rp.enterFirstName(fnm);
		rp.enterLastName(lnm);
		rp.enterEmail(email);
		rp.enterPassword(pwd);
		rp.enterConfirmPassword(cpwd);
		rp.clickRegisterbutton();
		System.out.println(fnm+" Register Sucessful");
		
		wp.clickLogoutlink();
		wp.clickregisterlink();
	}

}
