package seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.redbus.com/");

Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Ex: Paris']")).sendKeys("Bellary");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='Ex: London Airport']")).sendKeys("Banglore, Karnataka, India");
Thread.sleep(5000);
JavascriptExecutor js = ((JavascriptExecutor) driver);

js.executeScript("document.getElementById('onward_cal').value='11/12/2024'");
//driver.findElement(By.xpath("//div[@class='search-lbl']")).click();

driver.navigate().to("https://www.remove.bg/");


driver.findElement(By.xpath("\"//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]\"")).click();

Runtime.getRuntime().exec(new String[] {"C:\\Users\\farha\\OneDrive\\Desktop\\AutoIT_Demo\\scriptupload.exe"});
//driver.close();

}

}
