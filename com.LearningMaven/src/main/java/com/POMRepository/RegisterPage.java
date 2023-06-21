package com.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LearningMaven.generic.BaseTest;

public class RegisterPage extends BaseTest
{
	public WebElement getMaleradiobtn() {
		return maleradiobtn;
	}
	public WebElement getFemaleradiobtn() {
		return femaleradiobtn;
	}
	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}
	public WebElement getConfirmPasswordtextfield() {
		return ConfirmPasswordtextfield;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement maleradiobtn;

	@FindBy(id = "gender-female")
	private WebElement femaleradiobtn;

	@FindBy(name = "FirstName")
	private WebElement firstnametextfield;

	@FindBy(name = "LastName")
	private WebElement lastnametextfield;

	@FindBy(id = "Email")
	private WebElement emailtextfield;

	@FindBy(id = "Password")
	private WebElement Passwordtextfield;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordtextfield;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;
	
	public void clickMaleRadiobutton() 
	{
		maleradiobtn.click();
	}
	public void clickFemaleRadiobutton() 
	{
		femaleradiobtn.click();
	}
	public void enterFirstName(String text)
	{
		firstnametextfield.sendKeys(text);
	}
	public void enterLastName(String text)
	{
		lastnametextfield.sendKeys(text);
	}
	public void enterEmail(String text)
	{
		emailtextfield.sendKeys(text);
	}
	public void enterPassword(String text)
	{
		Passwordtextfield.sendKeys(text);
	}
	public void enterConfirmPassword(String text)
	{
		ConfirmPasswordtextfield.sendKeys(text);
	}
	
	public void clickRegisterbutton() 
	{
		registerbutton.click();
	}

	
}
