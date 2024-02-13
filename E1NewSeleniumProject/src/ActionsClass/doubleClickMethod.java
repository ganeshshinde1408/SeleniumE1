package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();
		
		WebElement doubleclick = driver.findElement(By.xpath("//a[text()='Double Click']"));
		act.click(doubleclick).perform();
		
		WebElement button1 = driver.findElement(By.id("btn20"));
		act.doubleClick(button1).perform();
		
		WebElement button2 = driver.findElement(By.id("btn23"));
		act.doubleClick(button2).perform();
		
		WebElement button3 = driver.findElement(By.id("btn28"));
		act.doubleClick(button3).perform();		
}
}