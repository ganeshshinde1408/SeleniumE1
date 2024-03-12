package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage{
	//Declaration
	   @FindBy(xpath="//div[text()='Time-Track']/../ descendant :: img") private WebElement timetrackModule;
	   @FindBy(xpath= "//div[text()='Tasks']/following-sibling :: img") private WebElement  taskModule;
	   @FindBy(xpath="//div[text()='Reports']/following-sibling :: img") private WebElement  reportModule;
	   @FindBy(xpath="//div[text()='Users']/following-sibling :: img") private WebElement usersMOdule;
	   @FindBy(xpath ="//div[text()='Work Schedule']/following-sibling :: img")WebElement workScheduleModule;
	   @FindBy(xpath="//div[text()='Settings']/following-sibling :: img") WebElement  settingsModule;
	   @FindBy(partialLinkText = "Logout") WebElement logout;
	  
	   
	   public homePage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }


	public WebElement getTimetrackModule() {
		return timetrackModule;
	}


	public WebElement getTaskModule() {
		return taskModule;
	}


	public WebElement getReportModule() {
		return reportModule;
	}


	public WebElement getUsersMOdule() {
		return usersMOdule;
	}


	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}


	public WebElement getSettingsModule() {
		return settingsModule;
	}


	public WebElement getLogout() {
		return logout;
	}

       
}
