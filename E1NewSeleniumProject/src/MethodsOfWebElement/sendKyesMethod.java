package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKyesMethod {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
	}
}