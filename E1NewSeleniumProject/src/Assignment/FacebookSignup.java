package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
        
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));
		
		Select daysel = new Select (dayDD);
		boolean result1 = daysel.isMultiple();
		System.out.println("Dropdown is multiple ? :"+result1);
		
		List<WebElement> ops1 = daysel.getOptions();
		for(WebElement we:ops1)
		{
			System.out.println(we.getText());
		}
		daysel.selectByIndex(13);
		System.out.println();
		
		
		Select monthsel = new Select (monthDD);
		boolean result2 = monthsel.isMultiple();
		System.out.println("Dropdown is multiple ? :"+result2);
		
		List<WebElement> ops2 = monthsel.getOptions();
		for(WebElement mon:ops2)
		{
			System.out.println(mon.getText());
		}
		monthsel.selectByValue("8");
		System.out.println();
		
		Select yearsel = new Select (yearDD);
		boolean result3 = yearsel.isMultiple();
		System.out.println("Dropdown is multiple ? :"+result3);
		
		List<WebElement> ops3 = yearsel.getOptions();
		for(WebElement year1:ops3)
		{
			System.out.println(year1.getText());
		}
		yearsel.selectByVisibleText("1999");
		
		
		

}
}