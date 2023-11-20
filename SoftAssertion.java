package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		}
	@Test
	public void GetTitle() {
		SoftAssert sf = new SoftAssert();
		String expectedtitle = "your Selenium Store";
		String Actualtitle = driver.getTitle();
		sf.assertEquals(expectedtitle,Actualtitle,"The title Dosent Match");
		driver.findElement(By.name("search")).sendKeys("mac");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}

}
