package com.LearningMaven.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest extends UtilityMethod
{
	
	

	@DataProvider(name="rgstrdata",parallel = true)
	public Object[][] Rgstrdata() 
	{
		Object[][] data=new Object[3][5];
		data[0][0]="1spiders";
		data[0][1]="Q";
		data[0][2]="qsp@gmail.com";
		data[0][3]="qsp123";
		data[0][4]="qsp123";
		
		data[1][0]="2spiders";
		data[1][1]="j";
		data[1][2]="jsp@gmail.com";
		data[1][3]="jsp123";
		data[1][4]="jsp123";
		
		data[2][0]="3spiders";
		data[2][1]="Py";
		data[2][2]="pysp@gmail.com";
		data[2][3]="pysp123";
		data[2][4]="pysp123";
		return data;
	}
	@DataProvider(name="E-regdata")
	public String[][] readexcel() throws Exception 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("login").getLastRowNum();
		int row=wb.getSheet("login").getPhysicalNumberOfRows();
		int colum=wb.getSheet("login").getRow(0).getPhysicalNumberOfCells();
		
		//to create 2D array
		String[][] data=new String[row-1][colum];
		
		//To enter data in 2D array from Excel
		for (int i = 1; i < row; i++) //<--Row iteration
		{
			for (int j = 0; j < colum; j++)//<--Column iteration
			{
				data[i][j]=wb.getSheet("login").getRow(i).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}

		return data;
	}
	
	@DataProvider(name="lgnData")
	public Object[][] lgndata() 
	{
		Object[][] data=new Object[1][2];
		data[0][0]="qspiders@gmail.com";
		data[0][1]="qsp123";
		return data;
	}
 
	@Parameters("browser")
	@BeforeClass
	public void Browser_setup(@Optional("chrome")String browser)
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","./src/main/resources/driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		initobjects();
	}
	@AfterClass
	public void Browser_terminate() 
	{
		driver.quit();

	}



}
