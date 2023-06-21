package com.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage 
{

	public ShoppingCartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[1]")
	private WebElement firstPrdChckbox;
	

	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[3]")
	private WebElement firstPrdName;
	
	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[4]")
	private WebElement firstPrdPrice;

	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[5]")
	private WebElement firstPrdQnty;
	
	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[6]")
	private WebElement firstPrdTprice;

	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[2]/td[1]")
	private WebElement secondPrdChckbox;
	
	

	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[2]/td[3]")
	private WebElement secondPrdName;
	
	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[2]/td[4]")
	private WebElement secondPrdPrice;

	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[2]/td[5]")
	private WebElement secondPrdQnty;
	
	@FindBy(xpath = "(//td[@class='remove-from-cart'])[1]/../../tr[2]/td[6]")
	private WebElement secondPrdTprice;
	
	
	
	public String getFirstPrdName() 
	{
		
		return firstPrdName.getText();
	}

	public String getFirstPrdPrice() 
	{
		return firstPrdPrice.getText();
	}

	public String getFirstPrdQnty() {
		return firstPrdQnty.getText();
	}

	public String getFirstPrdTprice() {
		return firstPrdTprice.getText();
	}

	
	public String getSecondPrdName() {
		return secondPrdName.getText();
	}

	public String getSecondPrdPrice() {
		return secondPrdPrice.getText();
	}

	public String getSecondPrdQnty() {
		return secondPrdQnty.getText();
	}

	public String getSecondPrdTprice() {
		return secondPrdTprice.getText();
	}
	@FindBy(name = "updatecart")
	private WebElement updatecartButton;
	
	public void ClickUpdatecartBtn() 
	{
		updatecartButton.click();
	}
	
	@FindBy(name = "continueshopping")
	private WebElement continueshoppingButton;
	
	public void ClickContinueshoppingBtn()
	{
		continueshoppingButton.click();
	}

}
