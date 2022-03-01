package testingpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	
		@Test
		public void openBing() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.diver","C:\\Users\\Siddiq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.bing.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total Time Taken"+totalTime);
	}
		
	    @Test
		public void openGoogle() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Siddiq\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total Time Taken"+totalTime);
		
	}
	        @Test
			public void openYahoo() {
			long startTime=System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Siddiq\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://www.yahoo.com");
			driver.quit();
			long endTime=System.currentTimeMillis();
			long totalTime=endTime-startTime;
			System.out.println("Total Time Takem"+totalTime);
			
		}
		
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	


