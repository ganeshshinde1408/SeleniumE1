package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		//to generate alert Popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		//To switch control to the Alert popup
	 Alert alertPopup = driver.switchTo().alert();
		
		//To click on Ok Button
		//alertPopup.accept();
		
		alertPopup.dismiss();

	}

}
