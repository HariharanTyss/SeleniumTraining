package com.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;

@Listeners(com.LearningMaven.generic.ListenerImplementation.class)
public class Search extends BaseTest
{
	
	@Test
	public void searchtest() throws InterruptedException
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("jewelry");
		
		//Assert.fail();
//		Thread.sleep(2000); 
//		System.out.println("search Test Sucessful");
	}


}
