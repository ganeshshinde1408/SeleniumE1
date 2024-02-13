package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselctAllByUsingForLoop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        
		WebElement singleselectDD = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select (singleselectDD);
		
		for(int i=0;i<=7;i++) 
		{
	    sel.selectByIndex(i);
	    Thread.sleep(1000);
		}
		Thread.sleep(3000); 
		
	    for(int j=0;j<=7;j++)
	    {
	    sel.deselectByIndex(j);	
	    Thread.sleep(1000);	
	    }
	}
}
