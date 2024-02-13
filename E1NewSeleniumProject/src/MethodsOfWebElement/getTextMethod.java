package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) {
		

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");

		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		String loginText = loginButton.getText();
		System.out.println(loginText);
		
		WebElement link = driver.findElement(By.id("licenseLink"));
		String linkText = link.getText();
		System.out.println(linkText);
	}
}