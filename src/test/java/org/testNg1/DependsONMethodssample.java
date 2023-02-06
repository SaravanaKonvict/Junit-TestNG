package org.testNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsONMethodssample {

	@Test(dataProvider="getDatas",dataProviderClass=DataProviderSample.class)
	public void tc1(String i, String k) {
		System.out.println(i);
		System.out.println(k);

		System.out.println("Test condition 1");
	}

	@Test(dependsOnMethods="tc1")
	public void tc2() {
		System.out.println("Test condition 2");
	}

	@Test(dependsOnMethods="tc3")
	public void tc4() {
		System.out.println("Test condition 4");
	}
	
	@Test(dependsOnMethods="tc2")
	public void tc3() {
		System.out.println("Test condition 3");
	}


}
