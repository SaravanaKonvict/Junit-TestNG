package org.testNg1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertion {

	//Git Hub Practice
	
	@Test(enabled=false)
	private void Tc1() {
	//hard assert
		String s = "abc";
		Assert.assertEquals(s, "abc");
		System.out.println("Git Hub Training");
		System.out.println("Assert passed");
		System.out.println("Modifications Git Hub Training");
		}
	
	@Test(enabled=false)
	private void Tc3() {
	//hard assert
		String s = "abc";
		Assert.assertEquals(s, "Abc");
		System.out.println("Assert passed");
		
	}
	@Test(enabled=false,expectedExceptions=AssertionError.class)
	private void Tc2() {
	//hard assert
		String s = "abc";
		Assert.assertEquals(s, "Abc");
		System.out.println("Assert passed");
		
	}

@Test(enabled=false)
	private void Tc5() {
	//soft assert
		String s = "abc";
		SoftAssert soft = new SoftAssert();
soft.assertEquals(s, "Abc", "assertcondition");
		System.out.println("Assert failed");
		
	}

@Test()
private void Tc7() {
//hard assert
	String s = "abc";
	SoftAssert soft = new SoftAssert();
	soft.assertAll();
soft.assertEquals(s, "Abc", "assertcondition");
	System.out.println("Assert failed");
	
}

}
