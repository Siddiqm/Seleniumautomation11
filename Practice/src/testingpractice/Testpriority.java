package testingpractice;

import org.testng.annotations.Test;

public class Testpriority {
	
	
	@Test (priority=0)
	public void Method1() {
		System.out.println("Method1");
	}
	
	@Test(priority=1)
	public void Method2() {
		System.out.println("Method2");
	}
	
	@Test(priority=-2)
	public void Method3() {
		System.out.println("Method3");
	}
	
	@Test(priority=3)
	public void Method4() {
	System.out.println("Method4");
	}
	
	@Test(priority=4)
	public void Method5() {
	System.out.println("Method5");
	}
			
	
	}
	
	



