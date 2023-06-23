package com.POMTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;
import com.POMRepository.WelcomePage;

public class ValidateProductJewelryTest extends BaseTest

{
	@Test
	public void validatejwelprd() 
	{ 
		
		
		
		String etitle = "Demo web Shop"; 
		String atitle = driver.getTitle();
		
		System.out.println("Actual title is :"+atitle);
//		if (etitle.equals(atitle)) 
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("FAIL");
//		}
		
		Assert.assertEquals(etitle, atitle);
		
		
		
	}
	

	


}
