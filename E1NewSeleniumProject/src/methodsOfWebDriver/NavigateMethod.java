package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch Chrome Browser
		driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN0G0&p=amazon");
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();//To close the browser window
	}
	}

