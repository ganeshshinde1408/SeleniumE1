package JavascriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingRightLeft {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from webDriver To JavaScriptExecutor
	
		//To perform scroll Right operation
	    js.executeScript("window.scrollBy(500,0)");
	    Thread.sleep(2000);
				
		//To perform scroll Left operation
		js.executeScript("window.scrollBy(-150,0)");
		
		driver.close();
	}
}
