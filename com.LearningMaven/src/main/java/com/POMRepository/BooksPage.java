package com.POMRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage
{


	public BooksPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="products-orderby")
	private WebElement sortbydropdown;
	
	@FindBy(id ="products-pagesize")
	private WebElement displaydropdown;
	
	@FindBy(id ="products-viewmode")
	private WebElement viewdropdown;
	
	public void clickSortbydropdown(String option) 
	{
		Select st=new Select(sortbydropdown);
		
		st.selectByVisibleText(option);
	}
	public void clickDisplaydropdown(String option) 
	{
		Select st=new Select(displaydropdown);
		
		st.selectByVisibleText(option);
	}
	public void clickViewdropdown(String option) 
	{
		Select st=new Select(viewdropdown);
		
		st.selectByVisibleText(option);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[1]/div[1]/div[2]/div[3]/div[2]")
	private WebElement firstProduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[2]/div[1]/div[2]/div[3]/div[2]")
	private WebElement secondProduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[3]/div[1]/div[2]/div[3]/div[2]")
	private WebElement thirdProduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[4]/div[1]/div[2]/div[3]/div[2]")
	private WebElement fourthProduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[5]/div[1]/div[2]/div[3]/div[2]")
	private WebElement fifthProduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]/../../../../../../div[6]/div[1]/div[2]/div[3]/div[2]")
	private WebElement sixthProduct;
	
	public void AddFirstProduct() 
	{
		firstProduct.click();
	}
	public void AddsecondProduct() 
	{
		firstProduct.click();
	}
	public void AddthirdProduct() 
	{
		firstProduct.click();
	}
	public void AddfourthProduct() 
	{
		firstProduct.click();
	}
	public void AddfifthProduct() 
	{
		firstProduct.click();
	}
	public void AddsixthProduct() 
	{
		firstProduct.click();
	}
	
	
}
