package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelPromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		 Alert promptAlert = driver.switchTo().alert();
		
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		Thread.sleep(1000);
		
		promptAlert.sendKeys("Ganesh");
		Thread.sleep(1000);
		promptAlert.accept();

	}

}
