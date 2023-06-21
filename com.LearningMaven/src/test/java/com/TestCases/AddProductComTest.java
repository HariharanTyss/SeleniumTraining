package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.LearningMaven.generic.BaseTest;

public class AddProductComTest extends BaseTest 
{
	@Test
	public void Addproduct() throws InterruptedException 
	{
		//Adding product from computer category
		driver.findElement(By.partialLinkText("Computers")).click();

		//click on desktop Category
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[3]")).click();

		//Select 1 product and add to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]")).click();

		WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'Simple')]"));
		System.out.println(ele.getText());

		driver.findElement(By.xpath("//input[@value='96']")).click();

		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();

		WebElement res_text = driver.findElement(By.xpath("//p[@class='content']"));
		System.out.println(res_text.getText());


	}


}
