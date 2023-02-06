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

public class suite3 {


	
	@Test(groups="@smoke",priority=4)
	public void tc21() {
		System.out.println("Test condition 21");
	}

	@Test(groups="@reg",priority=6)
	public void tc22() {
		System.out.println("Test condition 22");
	}

	@Test(groups="@reg",priority=8)
	public void tc24() {
		System.out.println("Test condition 24");
	}
	
	@Test(groups="@smoke",priority=5)
	public void tc23() {
		System.out.println("Test condition 23");
	}

	
	
	@Test(groups="sanity",priority=7,invocationCount=3,dependsOnGroups="@reg")
	public void tc25() {
		System.out.println("Test condition 25");
	}
	
	@Test(priority=3)
	public void tc26() {
		System.out.println("Test condition 26");
	}
	@Test(invocationCount=4)
	public void tc27() {
		System.out.println("Test condition 27");
	}
	@Test()
	public void tc28() {
		System.out.println("Test condition 28");
	}
}
