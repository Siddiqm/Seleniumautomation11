package com.testing;

import org.testng.annotations.Test;

public class Mobile {
	
	
	//all types of mobile phone available 
	
	
	@Test (priority=0)
	public void Applephone1() {
		System.out.println("Applephone");
	}
	
	@Test (dependsOnMethods="Applephone1")
	public void Applephone2() {
		System.out.println("Applephone");
	}
	
	@Test (dependsOnMethods="Applephone2")
	public void Motophone1() {
		System.out.println("Motophone");
	}
	
	@Test (dependsOnMethods="Motophone1")
	public void Motophone2() {
		System.out.println("Motophone");
	}
	
	@Test (dependsOnMethods="Motophone2")
	public void Realmephone1() {
		System.out.println("Motophone");
	}
	
	@Test (dependsOnMethods="Realmephone1")
	public void Realmephone2() {
		System.out.println("Realmephone");
	}
	
	@Test (dependsOnMethods="Realmephone2")
	public void Samsungphone1() {
		System.out.println("Samsungphone");
	}
	
	@Test (dependsOnMethods="Samsungphone1")
	public void Samsungphone2() {
		System.out.println("samsungphone");
	}
}
