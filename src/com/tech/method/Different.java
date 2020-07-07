package com.tech.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Different {
	
	WebDriver driver=null;
	public  void LaunchBrowser() 
	{
		 driver=new FirefoxDriver();
	}
	
	public  void LaunchApplication(String url) 
	{
		driver.get(url);
	}
	public void Login(String un,String pwd) throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys(un);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}
	public String LoginVerify(String expval)
	{
		String val="False";
		String actval=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			val="pass";
		}	
		if(val=="pass")
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Login not successfully");
		}
		return val;	
		
	}

}
