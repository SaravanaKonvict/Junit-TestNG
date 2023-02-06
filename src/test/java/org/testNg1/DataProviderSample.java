package org.testNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSample {

	@DataProvider
	public Object[][] getData() {
		
	Object[][] s = new Object[3][2];
	s[0][0] = "a";
	s[0][1] = "b";
	s[1][0] = "g";
	s[1][1] = "h";
	s[2][0] = "m";
	s[2][1] = "n";
	return s;
	
	}
	
	@Test(dataProvider="getData")
	public void m1(String t,String h) {
		System.out.println(t);
		System.out.println(h);
	}
	
	@DataProvider
	public Object[][] getDatas() {
		return new Object[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"}
		};
		
		
		
	}
	
	@Test(dataProvider="getDatas")
	public void browserLaunch(String s,String g) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s);
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys(g);
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
		

	}
}
