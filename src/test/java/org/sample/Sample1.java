package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample1 {

	@BeforeClass
	public static void Tc01() {
		// TODO Auto-generated method stub
System.out.println("before class");
	}
	
@AfterClass
	public static void Tc02() {
		// TODO Auto-generated method stub
		System.out.println("after class");

	}

	@Test
	public void Tc03() {
		// TODO Auto-generated method stub
		System.out.println("TEST 5");

	}

	@Test
	public void Tc04() {
		// TODO Auto-generated method stub
		System.out.println("TEST 6");

	}
@Before
	public void Tc05() {
		// TODO Auto-generated method stub
		System.out.println("BEFORE");

	}
@After
	public void Tc06() {
		// TODO Auto-generated method stub
		System.out.println("AFTER");

	}

	
}
