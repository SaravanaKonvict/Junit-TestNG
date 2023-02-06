package org.testNg1;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sample1 {


	
	@Test(alwaysRun=true,dependsOnMethods="tc2",priority=4)
	public void tc1() {
		System.out.println("Test condition 1");
	}

	@Test(priority=6,enabled=false)
	public void tc2() {
		System.out.println("Test condition 2");
	}

	@Test(priority=8)
	public void tc4() {
		System.out.println("Test condition 4");
	}
	
	@Test(priority=5)
	public void tc3() {
		System.out.println("Test condition 3");
	}

	
	
	@Test(priority=7,invocationCount=3)
	public void tc5() {
		System.out.println("Test condition 5");
	}
	
	@Test(priority=3,enabled=false)
	public void tc6() {
		System.out.println("Test condition 6");
	}
	@Test(invocationCount=4)
	public void tc7() {
		System.out.println("Test condition 7");
	}
	@Test()
	public void tc8() {
		System.out.println("Test condition 8");
	}
}
