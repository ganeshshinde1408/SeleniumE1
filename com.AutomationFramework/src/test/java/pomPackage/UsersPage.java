package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButtons;
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="passwordText") private WebElement passwordTB;
	@FindBy(name="passwordTextRetype") private WebElement retypePasswordTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB; 
	@FindBy(id="right12") private WebElement modifyTimeTrackCheckBox;
	@FindBy(id="right2") private WebElement manageCustomerAndProjectCheckBox;

	@FindBy(id="right1") private WebElement generateReportsCheckBox;

	@FindBy(id="right5") private WebElement manageUsersCheckBox; @FindBy(id="right7") private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath="//input[@type='submit']")private WebElement createUserButton;
	@FindBy(xpath="//input[@type='button']")private WebElement cancelButton;


public UsersPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getCreateNewUserButtons() {
	return createNewUserButtons;
}


public WebElement getUsernameTB() {
	return usernameTB;
}


public WebElement getPasswordTB() {
	return passwordTB;
}


public WebElement getRetypePasswordTB() {
	return retypePasswordTB;
}


public WebElement getFirstNameTB() {
	return firstNameTB;
}


public WebElement getLastNameTB() {
	return lastNameTB;
}


public WebElement getModifyTimeTrackCheckBox() {
	return modifyTimeTrackCheckBox;
}


public WebElement getManageCustomerAndProjectCheckBox() {
	return manageCustomerAndProjectCheckBox;
}


public WebElement getGenerateReportsCheckBox() {
	return generateReportsCheckBox;
}


public WebElement getManageUsersCheckBox() {
	return manageUsersCheckBox;
}


public WebElement getManageBillingTypeCheckBox() {
	return manageBillingTypeCheckBox;
}


public WebElement getCreateUserButton() {
	return createUserButton;
}


public WebElement getCancelButton() {
	return cancelButton;
}
public void CreateUserMethod(String usn,String pwd,String fname,String lname) throws InterruptedException
{
	createNewUserButtons.click();
	usernameTB.sendKeys(usn);
	Thread.sleep(1000);
	passwordTB.sendKeys(pwd);
	retypePasswordTB.sendKeys(pwd);
	Thread.sleep(1000);
	firstNameTB.sendKeys(fname);
	Thread.sleep(1000);
	lastNameTB.sendKeys(lname);
	Thread.sleep(1000);
	modifyTimeTrackCheckBox.click();
	Thread.sleep(1000);
	manageCustomerAndProjectCheckBox.click();
	Thread.sleep(1000);
	generateReportsCheckBox.click();
	Thread.sleep(1000);
	manageBillingTypeCheckBox.click();
	Thread.sleep(1000);
	createUserButton.click();
	
	
}
}

