package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(2000);
		
		List<WebElement> bikesOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement we : bikesOptions)
		{
			String options = we.getText();
			System.out.println(options);
		}
			
		
		
		

	}

}
