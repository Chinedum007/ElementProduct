package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class DeleteContact extends BasePage {

	public DeleteContact(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}

	@FindBy(id="ContactRecord")
    private WebElement ClickOnContactTab;
	
	@FindBy(id="ContactAddressBook")
	private WebElement ClickOnContactAvatar;
	
	@FindBy(id="searchFirstName")
	private WebElement EnterContactName;
	
	@FindBy(id="searchContactsBtn")
	private WebElement ClickOnSearchBtn;
	
	@FindBy(xpath="//td[text()='Mr Automation Test']")
	private WebElement DoubleClickToSelectContact;
	
	@FindBy(id="Delete")
	private WebElement ClickOnDeleteBtn;
	
	@FindBy(id="deleteContactButton")
	private WebElement ClickToConfirmDelete;
	
	@FindBy(xpath="//button[@class='btn btn-primary BMPDispose']")
	private WebElement ClickOkbtnToConfirm;
	
	public void deleteContact() throws InterruptedException {
		webActionUtil.clickOnElement(ClickOnContactTab);
		webActionUtil.clickOnElement(ClickOnContactAvatar);
		webActionUtil.enterData(EnterContactName, "Automation");
		Thread.sleep(2000);
		webActionUtil.clickOnElement(ClickOnSearchBtn);
		webActionUtil.doubleClick(DoubleClickToSelectContact);
		webActionUtil.clickOnElement(ClickOnDeleteBtn);
		webActionUtil.clickOnElement(ClickToConfirmDelete);
		webActionUtil.clickOnElement(ClickOkbtnToConfirm);
}
}
