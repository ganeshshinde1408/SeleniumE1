package Assignment;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/b/TO0gsVf5/my-trello-board");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
        
		 WebElement usernameTF = driver.findElement(By.id("user"));
		 usernameTF.sendKeys("gas7219458062@gmail.com");

		 driver.findElement(By.id("login")).click();
		 
		WebElement pswTF = driver.findElement(By.xpath("//input[@aria-describedby='password-uid2-helper']"));
		 pswTF.sendKeys("Ganesh@1408@1709");
		 
		 driver.findElement(By.xpath("//span[text()='Log in']")).click(); 
		 Thread.sleep(2000);
		 
		 WebElement javamock = driver.findElement(By.xpath("//a[text()='Java Mock']"));
		
		 
		 WebElement sqlmock = driver.findElement(By.xpath("//a[text()='SQL Mock']"));
		 
		 
		 WebElement manualmock = driver.findElement(By.xpath("//a[text()='Manual Mock']"));
		
		 
		 WebElement seleniummock = driver.findElement(By.xpath("//a[text()='Selenium Mock']"));
		 
		 
		 
		 WebElement apimock = driver.findElement(By.xpath("//a[text()='API Mock']"));
		 
		 
		 
		 WebElement mockGiven = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		 WebElement mockPending = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		 WebElement mockScheduled = driver.findElement(By.xpath("//h2[text()='Mock Sceduled']"));
		 
		  
		  Actions jm = act.dragAndDrop(javamock, mockGiven);
	      jm.perform();
	      Thread.sleep(2000);
	      act.contextClick(javamock).perform();
	      List<WebElement> javaOPS = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4 kos2yeJ8bcHAWx']"));
			 for(int i=0;i<javaOPS.size();i++) 
			 {
				System.out.println(javaOPS.get(i).getText());
			 }
			 driver.findElement(By.xpath("//button[text()='Save']")).click();
			 System.out.print(".........................................................");
	      Thread.sleep(2000);
	      
	      
		  Actions sm = act.dragAndDrop(sqlmock, mockGiven);
		  sm.perform();
		  act.contextClick(sqlmock).perform();
		  List<WebElement> sqlOPS = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4 kos2yeJ8bcHAWx']"));
		  for(int j=0;j<sqlOPS.size();j++) 
			 {
				System.out.println(sqlOPS.get(j).getText());
			 }
			 driver.findElement(By.xpath("//button[text()='Save']")).click();
			 System.out.print(".........................................................");
		  Thread.sleep(2000);
		  
		  Actions mm = act.dragAndDrop(manualmock, mockGiven);
		  mm.perform();
		  act.contextClick(manualmock).perform();
		  List<WebElement> manualOPS = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
		  for(int k=0;k<manualOPS.size();k++) 
			 {
				System.out.println(manualOPS.get(k).getText());
			 }
			 driver.findElement(By.xpath("//button[text()='Save']")).click();
			 System.out.print(".........................................................");
		  Thread.sleep(2000);
		  
		  
		  Actions sem = act.dragAndDrop(seleniummock, mockPending);
		  sem.perform();
		  Thread.sleep(2000);
		  act.contextClick(seleniummock).perform();
		  List<WebElement> seleniumOPS = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
		  for(int l=0;l<seleniumOPS.size();l++) 
			 {
				System.out.println(seleniumOPS.get(l).getText());
			 }
			 driver.findElement(By.xpath("//button[text()='Save']")).click();
			 System.out.print(".........................................................");
		  Thread.sleep(2000);
		  
		  Actions am = act.dragAndDrop(apimock, mockScheduled);
		  am.perform();
		  Thread.sleep(2000);
		  act.contextClick(apimock).perform();
		  List<WebElement> apiOPS = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
		  for(int m=0;m<apiOPS.size();m++) 
			 {
				System.out.println(apiOPS.get(m).getText());
			 }
			 driver.findElement(By.xpath("//button[text()='Save']")).click();
			 System.out.print(".........................................................");
		 
}
}