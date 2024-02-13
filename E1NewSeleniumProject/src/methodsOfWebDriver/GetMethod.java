package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch Chrome Browser
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN0G0&p=amazon");
		driver.close();//To close the browser window
	}
}
