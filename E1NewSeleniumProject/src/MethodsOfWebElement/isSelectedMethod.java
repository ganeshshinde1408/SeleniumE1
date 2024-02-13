package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("http://164.77.44.220/login.do");
	  
	  WebElement checkBox = driver.findElement(By.name("remember"));
	  checkBox.click();
	  boolean result = checkBox.isSelected();
      System.out.println(result);
	}
}
