package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

	    driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	    WebElement nameTextField = driver.findElement(By.id("name"));
	    boolean result = nameTextField.isEnabled();
	    System.out.println(result);
	}
}