package HandlingFrames;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingFrameElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
	
		WebElement TextBox = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(TextBox );
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7219458062");
	}
}
