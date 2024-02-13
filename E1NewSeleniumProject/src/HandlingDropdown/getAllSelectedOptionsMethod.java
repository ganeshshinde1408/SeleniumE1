package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        
		WebElement singleselectDD = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select (singleselectDD);
		
		for(int i=2; i<=5;i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		
		for(WebElement we:allSelectedOptions) 
		{
			String selectedOps = we.getText();
			System.out.println(selectedOps);
		}

	}
}
