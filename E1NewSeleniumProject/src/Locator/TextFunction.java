package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.CloseMethod;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//text()[.='Login']"));
		loginButton.click();		
	}
}