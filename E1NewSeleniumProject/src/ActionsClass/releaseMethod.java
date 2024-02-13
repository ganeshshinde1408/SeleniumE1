package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class releaseMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		
		WebElement mouseActions = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.click(mouseActions).perform();
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		WebElement circle = driver.findElement(By.xpath("//div[@id='circle']"));
		act.clickAndHold(circle).perform();
		
		Thread.sleep(5000);
		act.release(circle).perform();


}
}