package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) {
		// Open a Chrome Browser
		// Webdriver is a interface in selenium

		// Create a WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.selenium.dev/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Get the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);

		// Get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		// Find and interact with elements on the webpage
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
		element.click();

		// Perform some other actions, e.g., navigating back and forward
		driver.navigate().back();
		driver.navigate().forward();

		// Refresh the current page
		driver.navigate().refresh();

		// Close the browser window
		driver.close();

		// Quit the WebDriver instance and close all associated windows and processes
		driver.quit();

	}

}