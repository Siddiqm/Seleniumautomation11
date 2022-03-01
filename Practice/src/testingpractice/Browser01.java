package testingpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser01 {
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	
	@BeforeSuite
	public void lauchBrowswe() {
	startTime=System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Siddiq\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void openbing() {
	driver.get("http://www.bing.com");	
			
	}
	@Test	
	public void opengoogle() {
	driver.get("http://www.gogle.com");	
				
 }
	@Test	
	public void openYahoo() {
	driver.get("http://www.yahoo.com");	
					
	}
	
	@AfterSuite
	public void Browserclose() {
	driver.quit();
	endTime=System.currentTimeMillis();
	long totalTime=endTime-startTime;
	System.out.println("Time Total Taken"+totalTime);
	}
}
