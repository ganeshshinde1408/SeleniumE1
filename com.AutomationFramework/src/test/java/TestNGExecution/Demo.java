package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.google.co.in/");
	 Thread.sleep(1000);
	 driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
