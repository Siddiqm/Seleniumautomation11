package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Launchbrower {
	
	 WebDriver driver;
	 long startTime;
	 long endTime;

	 	@BeforeSuite
	 	public void launchbrowser() {
		System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddiq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
	}
	
	@Test	
	public void openBing(){
		driver.get("https://www.bing.com");
	}
	@Test
	public void openGoogle(){
		driver.get("https://www.google.com");
	}
	@Test
	public void openyahoo(){
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
	driver.close();	
	System.currentTimeMillis();
	long totalTime=System.currentTimeMillis();
	System.out.println("Total time taken" + totalTime);
		
	}
	
}
