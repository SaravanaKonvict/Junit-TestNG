package org.testNg1;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class suite1 {

	WebDriver driver;
	
	@Test(groups="@smoke",priority=4)
	public void tc1() {
		System.out.println("Test condition 1");
	}

	@Test(groups="@reg",priority=6)
	public void tc2() {
		System.out.println("Test condition 2");
	}

	@Test(groups="@reg",priority=8)
	public void tc4() {
		System.out.println("Test condition 4");
	}
	
	@Test(groups="@smoke",priority=5)
	public void tc3() {
		System.out.println("Test condition 3");
	}

	
	
	@Test(groups="sanity",priority=7,invocationCount=3,dependsOnGroups="@reg")
	public void tc5() {
		System.out.println("Test condition 5");
	}
	
	@Test(priority=3,enabled=false)
	public void tc6() {
		System.out.println("Test condition 6");
	}
	@Parameters("usernam")
	@Test(invocationCount=1)
	public void tc7(@Optional("welcome")String s) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s);
		
		System.out.println("Test condition 7");
	}
	@Parameters("password")
	@Test()
	public void tc8(@Optional("konvict")String g) {
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys(g);
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
		System.out.println("Test condition 8");
	}
}
