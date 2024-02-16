package JavascriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillPerticularWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		Object scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from webDriver To JavaScriptExecutor
	    js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
	}
}
