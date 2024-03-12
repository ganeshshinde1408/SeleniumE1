package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends baseTest {

		@FindBy(name = "username") private WebElement usnTB;
		@FindBy(name="pwd") private WebElement pwdTB;
		@FindBy(id="loginButton") private WebElement loginButton;
		@FindBy(name="remember") private WebElement rememberMeCheckbox;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getUsnTB() {
			return usnTB;
		}

		public WebElement getPwdTB() {
			return pwdTB;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getRememberMeCheckbox() {
			return rememberMeCheckbox;
		}
		//Operational Method
		public void validLoginMethod(String username, String password) throws InterruptedException {
			usnTB.sendKeys(username);
			Thread.sleep(1000);
			pwdTB.sendKeys(password);
			Thread.sleep(1000);
			loginButton.click();
		}
		public void invalidLoginMethod(String username, String password) throws InterruptedException {
			usnTB.sendKeys(username);
			Thread.sleep(1000);
			pwdTB.sendKeys(password);
			Thread.sleep(1000);
			loginButton.click();
			Thread.sleep(1000);
			usnTB.clear();
		}
		
		
			
  }
