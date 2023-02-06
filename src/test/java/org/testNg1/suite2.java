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

public class suite2 {


	
	@Test(groups="@smoke",priority=4)
	public void tc11() {
		System.out.println("Test condition 11");
	}

	@Test(groups="@reg",priority=6)
	public void tc12() {
		System.out.println("Test condition 12");
	}

	@Test(groups="@reg",priority=8)
	public void tc14() {
		System.out.println("Test condition 14");
	}
	
	@Test(groups="@smoke",priority=5)
	public void tc13() {
		System.out.println("Test condition 13");
	}

	
	
	@Test(groups="sanity",priority=7,invocationCount=3,dependsOnGroups="@reg")
	public void tc15() {
		System.out.println("Test condition 15");
	}
	
	@Test(priority=3)
	public void tc16() {
		System.out.println("Test condition 16");
	}
	@Test(invocationCount=4)
	public void tc17() {
		System.out.println("Test condition 17");
	}
	@Test()
	public void tc18() {
		System.out.println("Test condition 18");
	}
}
