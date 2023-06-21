package com.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage 
{
	public WishlistPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
