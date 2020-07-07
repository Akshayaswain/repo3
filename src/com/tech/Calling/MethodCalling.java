package com.tech.Calling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tech.method.Different;

public class MethodCalling {

	public static void main(String[] args) throws InterruptedException {
//		Different d=new Different();
//		d.LaunchBrowser();
//		d.LaunchApplication("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		d.Login("aks4job@gmail.com","7672");
//		d.LoginVerify("Compose");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(200);
		int x=driver.findElements(By.id("identifieirId")).size();
		if(x>0)
		{
			System.out.println("exist");
			driver.findElement(By.id("identifierId")).sendKeys("akshaya");
		}
		else
		{
			System.out.println("not exist");
		}
	}

}
