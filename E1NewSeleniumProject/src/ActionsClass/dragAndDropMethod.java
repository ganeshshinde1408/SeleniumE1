package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		
		WebElement mouseActions = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.click(mouseActions).perform();
		
		WebElement dragAndDrop = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		act.click(dragAndDrop).perform();
		
		WebElement dragPosition = driver.findElement(By.partialLinkText("Drag Position"));
		act.click(dragPosition).perform();
		
		WebElement mobileChargerSource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement laptopChargerSource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement laptopCoverSource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement mobileAccessoriesSource = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement laptopAccessoriesSource = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

	    act.dragAndDrop(mobileChargerSource,mobileAccessoriesSource ).perform();
	    act.dragAndDrop(laptopChargerSource, laptopAccessoriesSource).perform();
	    act.dragAndDrop(laptopCoverSource, laptopAccessoriesSource).perform();
	    act.dragAndDrop(mobileCoverSource, mobileAccessoriesSource).perform();
	}
}