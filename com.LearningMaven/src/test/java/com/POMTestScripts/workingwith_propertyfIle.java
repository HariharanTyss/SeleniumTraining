package com.POMTestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class workingwith_propertyfIle 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/propertydata/configg.properties");
		Properties pp=new Properties();
		pp.load(fis);
		
		System.out.println(pp.getProperty("url"));
		System.out.println(pp.getProperty("username"));
		System.out.println(pp.getProperty("password"));
		
		
		
	}

}
