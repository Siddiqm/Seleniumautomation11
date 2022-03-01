package com.testing;

import org.testng.annotations.Test;

public class Drivecar {
	
	@Test (enabled=false)
	public void startcar() {
		System.out.println("star car");
	}
	
	@Test (dependsOnMethods="startcar")
	public void putfirstgear() {
		System.out.println("first gear");
	}
	
	@Test (dependsOnMethods="putfirstgear")
	public void putsecondgear() {
		System.out.println("second gear");
	}
	
	@Test (dependsOnMethods="putsecondgear")
	public void putthirdgear() {
		System.out.println("thrid gear");
	}
	
	@Test (dependsOnMethods="putthirdgear")
	public void putfourthgear() {
		System.out.println("fourth gear");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}