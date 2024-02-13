package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingRemoteWebDriver {
	public static void main(String[] args) throws InterruptedException, IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
         File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/Amazon.jpg");
		Files.copy(src, dest);
		
		
	}

}
