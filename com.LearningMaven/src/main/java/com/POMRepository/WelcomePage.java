package com.POMRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText  = "Log in")
	 private WebElement loginlink;
	
	
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement shoppingcartlink;
	
	
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTextfield;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//span[contains(text(),'Wishlist')]")
	private WebElement wishlistlink;
	
	@FindBy(id = "newsletter-email")
	private WebElement subscribeemailtextfiled;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribebutton;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement Bookslink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement Computerslink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement Electronicslink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement AppshoeLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement Digitaldwnldlink;

	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelrylink;

	
	
	public void clickregisterlink() 
	{
		registerlink.click();
	}
	public void clicklogin() 
	{
		 loginlink.click();
	}
	public void clickLogoutlink() 
	{
		logoutlink.click();
	}
	public void clicksubscribeEmailTextfiled() 
	{
		subscribeemailtextfiled.click();
	}
	public void clicksubscribeButton() 
	{
		subscribebutton.click();
	}

	
	public void enterSearchText(String Searchtext)
	{
		searchTextfield.sendKeys(Searchtext);
	}
	
	public void clicksearchbutton() 
	{
		searchButton.click();
	}
	public void clickBookslink() 
	{
		Bookslink.click();
	}
	public void clickComputerslink() 
	{
		Computerslink.click();
	}
	public void clickElectronicslink() 
	{
		Electronicslink.click();
	}
	public void clickAppshoeLink() 
	{
		AppshoeLink.click();
	}
	public void clickDigitaldwnldlink() 
	{
		Digitaldwnldlink.click();
	}
	public void clickJewelrylink() 
	{
		Jewelrylink.click();
	}
	
	

}
