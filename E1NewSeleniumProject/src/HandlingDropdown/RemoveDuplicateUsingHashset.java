package HandlingDropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Akshay/OneDrive/Desktop/WebElement/multiselectdropdown.html");
        
		WebElement singleselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select (singleselectDD);
		HashSet<String> hs = new HashSet<String>();
		List<WebElement> options = sel.getOptions();
		for(int i=0;i<options.size();i++)
		{
			
		}
   }
}
