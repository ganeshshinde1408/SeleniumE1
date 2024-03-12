package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='March 2024']/ancestor :: div[@class='DayPicker-Month']/descendant :: p[text()='25']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
