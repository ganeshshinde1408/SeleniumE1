package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	@FindBy(xpath="//a[text()='Projects & Customers']") private WebElement projectAndCustomerLink;
	@FindBy(xpath="//input[@value='Create New Customer']")private WebElement createNewCustomerButton;
    @FindBy(name="name") private WebElement customerNameTB;
	@FindBy(name="createCustomerSubmit") private WebElement createCustomerButton;
	@FindBy(xpath="//input[contains (@value, Cancel')]") private WebElement cancelButton;
	@FindBy(xpath="//input[@value='Create New Project']") private WebElement createNewProjectButton;
	@FindBy(name="customerId" ) private WebElement selectCustomnerDD;
	@FindBy(name="name") private WebElement projectNameTB;
	@FindBy(name="createProjectSubmit") private WebElement createProjectButton;
	@FindBy(partialLinkText = "All") private WebElement selectAllCustomerAndProjectLink;
	@FindBy(xpath="//input[@value='Delete Selected']")private WebElement deleteSelectedButton;
	@FindBy(xpath="//input[@value='Archive Selected']") private WebElement archiveSelectedButtons;
	@FindBy(id="deleteButton") private WebElement deleteThisCustomerPopup;

	public TaskPage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public WebElement getProjectAndCustomerLink() {
		return projectAndCustomerLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getSelectCustomnerDD() {
		return selectCustomnerDD;
	}

	public WebElement getProjectNameTB() {
		return projectNameTB;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public WebElement getSelectAllCustomerAndProjectLink() {
		return selectAllCustomerAndProjectLink;
	}

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getArchiveSelectedButtons() {
		return archiveSelectedButtons;
	}
	public void createCustomer(String customerName) throws InterruptedException
	{
		projectAndCustomerLink.click();
		Thread.sleep(1000);
		createNewCustomerButton.click();
		Thread.sleep(1000);
		customerNameTB.sendKeys(customerName);
		Thread.sleep(1000);
		createCustomerButton.click();
		
	}
	
	public void createProject(String customerName,String projectName) throws InterruptedException
	{
		projectAndCustomerLink.click();
		Thread.sleep(1000);
		createNewProjectButton.click(); 
		Thread.sleep(1000);
		Select sel = new Select(selectCustomnerDD);
		sel.selectByVisibleText(customerName);
		
		projectNameTB.sendKeys(projectName);
		createProjectButton.click();
		
	}
	
	public void deleteAllCustomerAndProjects() throws InterruptedException 
	{
		projectAndCustomerLink.click();
		Thread.sleep(1000);
		selectAllCustomerAndProjectLink.click();
		deleteSelectedButton.click();
		deleteThisCustomerPopup.click();
		
		
	}

}
