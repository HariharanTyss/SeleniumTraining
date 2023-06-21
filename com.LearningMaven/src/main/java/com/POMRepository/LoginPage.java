package com.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.LearningMaven.generic.BaseTest;

public class LoginPage extends BaseTest
{
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	 WebElement emailtextfield;

	@FindBy(id = "Password")
	 WebElement Passwordtextfield;
	

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	public void enterEmail(String text)
	{
		emailtextfield.sendKeys(text);
	}
	public void enterPassword(String text)
	{
		Passwordtextfield.sendKeys(text);
	}
	public void clickLoginbutton() 
	{
		loginButton.click();
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}


}
