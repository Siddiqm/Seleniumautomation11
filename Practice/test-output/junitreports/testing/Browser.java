package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser {
	
	
		@Test (priority=0)
		public void openBeing(){
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddiq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime; 
		System.out.println("Total time taken" + totalTime);
	}

	
		@Test(priority=1)
		public void opengoogle(){
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddiq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime; 
		System.out.println("Total time taken" + totalTime);
	}
	
		    @Test (priority=2)
			public void openyahoo(){
			long startTime=System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddiq\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.yahoo.com");
			driver.quit();
			long endTime=System.currentTimeMillis();
			long totalTime=endTime-startTime; 
			System.out.println("Total time taken" + totalTime);
		}
	

}
