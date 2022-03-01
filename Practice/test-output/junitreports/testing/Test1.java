package com.testing;

import org.testng.annotations.Test;

public class Test1 {

	@Test (priority=0)
	public void Firstcase() {
		System.out.println("This is first test case");
}
	@Test  (priority=1)
	public void Secondcase() {
		System.out.println("This is seccond test case");
	}
	@Test  (priority=2)
	public void Thirdcase() {
	 System.out.println("This is third test case");
	
	}
	@Test  (priority=3)
	public void Fourthcase() {
		System.out.println("This is fourth test case");
	}

	@Test  (priority=4)
	public void Fifthcase() {
		System.out.println("This is fifth test case");
	}
	
	
}