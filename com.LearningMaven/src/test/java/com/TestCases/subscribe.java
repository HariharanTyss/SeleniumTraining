package com.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;

public class subscribe extends BaseTest
{

	@Test
	public void Subscribe() 
	{
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	}
}
