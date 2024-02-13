package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        
		WebElement singleselectDD = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select (singleselectDD);
		sel.selectByIndex(2);
		Thread.sleep(5000);
		sel.deselectByIndex(2);
		
		
		sel.selectByValue("4");
		Thread.sleep(5000);
		sel.deselectByValue("4");
		
		sel.selectByVisibleText("Five");
		Thread.sleep(5000);
		sel.deselectByVisibleText("Five");
	}

}
