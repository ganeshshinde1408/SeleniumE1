package Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneToHandligFrames {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gad_source=1&gclid=EAIaIQobChMIpNvD59fBhAMV5NMWBR17LwIYEAAYASAAEgIFxPD_BwE");

		driver.findElement(By.id("confirmBtn")).click();
		driver.switchTo().frame("fc_widget");
		driver.findElement(By.id("chat-icon")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Ganesh");
	}
}