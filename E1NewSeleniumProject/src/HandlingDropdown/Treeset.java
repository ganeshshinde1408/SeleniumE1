package HandlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treeset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Akshay/OneDrive/Desktop/WebElement/multiselectdropdown.html");
        
		WebElement singleselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select (singleselectDD);
		
		 TreeSet<String> ts = new TreeSet <String>();
		 
		 List<WebElement> options = sel.getOptions();
		 
		 for(WebElement we: options)
		 {
			String ops = we.getText();
			ts.add(ops);
		 }
		 System.out.println(ts);
	}
}
