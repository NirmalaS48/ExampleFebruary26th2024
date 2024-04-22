package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		closeapplication();

	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new EdgeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


private static void navigateURL()
{
	try
	{
		oBrowser.get("https://www.actitime.com/login-to-product");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeapplication()
{
	try
	{
		oBrowser.quit();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

	
