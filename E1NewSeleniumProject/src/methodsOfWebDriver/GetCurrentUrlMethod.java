package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String currenturl = driver.getCurrentUrl();
	    System.out.println(currenturl);
	}

}
