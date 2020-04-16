package com.bestbuy.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // Stops showing starting chrome browser...... in the console
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.homegoods.com/");
		
		// CONFIRM LOGO
		
		WebElement logo = driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/a/img"));
		boolean logopresent = logo.isDisplayed();
		if(logo.isDisplayed())
		{
			System.out.println("Homegoods logo is present on the homepage");
		}

		driver.close();
	
	}

}
