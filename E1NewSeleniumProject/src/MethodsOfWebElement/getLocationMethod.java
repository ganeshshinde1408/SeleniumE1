package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");

		WebElement loginButton=driver.findElement(By.id("loginButton"));
		Point point = loginButton.getLocation();
		int x_axis = point.getX();
		int y_axis = point.getY();
		
		System.out.println("X axis is:"+x_axis+" "+"Y axis is: "+y_axis);
	}
}