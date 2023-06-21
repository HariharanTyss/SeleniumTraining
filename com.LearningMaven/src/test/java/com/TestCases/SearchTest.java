package com.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;


public class SearchTest extends BaseTest
{
	
	@Test
	public void searchtest() throws InterruptedException
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("jewelry");
		Thread.sleep(2000);
		System.out.println("search Test Sucessful");
	}

}
