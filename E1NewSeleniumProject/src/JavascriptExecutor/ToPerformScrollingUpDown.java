package JavascriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingUpDown {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from webDriver To JavaScriptExecutor
		
		//To perform scroll Down operation
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		//To perform scroll Up operation
		js.executeScript("window.scrollBy(0,-500)");
		
	}
}
