package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {
	public static void main(String[] args) throws InterruptedException, IOException {
	 ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
    File src = driver.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./screenshots/Facebook.jpg");
	Files.copy(src, dest);

}
}