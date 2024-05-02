package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class AddContact extends BasePage{

	public AddContact(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
     @FindBy(id="ContactRecord")
     private WebElement ClickOnContactTab;
     
     @FindBy(id="New")
     private WebElement ClickOnNewBtn;
     
     @FindBy(id="contactTitle")
     private WebElement SelectTitleFromDropdown;
     
     @FindBy(id="firstName")
     private WebElement EnterForename;
     
     @FindBy(id="lastName")
     private WebElement EnterLastname;
     
     @FindBy(id="contactType")
     private WebElement SelectContactType;
     
     @FindBy(id="contactDepartment")
     private WebElement SelectContactDepartment;
     
     @FindBy(id="title")
     private WebElement EnterJobTitle;
     
     @FindBy(id="telephone")
     private WebElement EnterTelephone;
     
     @FindBy(id="email")
     private WebElement EnterEmail;
     
     @FindBy(id="company")
     private WebElement EnterCompanyAddress;
     
     @FindBy(id="add1")
     private WebElement EnterAdd1;
     
     @FindBy(id="add2")
     private WebElement EnterAdd2;
     
     @FindBy(id="add3")
     private WebElement EnterAdd3;
     
     @FindBy(id="city")
     private WebElement EnterCity;
     
    @FindBy(id="postcode") 
    private WebElement EnterPostcode;
    
    @FindBy(id="Save")
    private WebElement ClickSave;
    
    public void addContact() throws InterruptedException {
     webActionUtil.clickOnElement(ClickOnContactTab);	
     webActionUtil.clickOnElement(ClickOnNewBtn);
     webActionUtil.selectByTextInListBox(SelectTitleFromDropdown, "Mr");
     webActionUtil.enterData(EnterForename, "Automation");
     webActionUtil.enterData(EnterLastname, "Test");
     webActionUtil.selectByTextInListBox(SelectContactType, "Sponsor");
     webActionUtil.selectByTextInListBox(SelectContactDepartment, "Family Division");
     webActionUtil.enterData(EnterJobTitle, "Doctor");
     webActionUtil.enterData(EnterTelephone, "1234564566");
     webActionUtil.enterData(EnterEmail, "chin1010@yopmail.com");
     webActionUtil.enterData(EnterCompanyAddress, "Bookwise Solutions");
     webActionUtil.enterData(EnterAdd1, "2 Automation Street");
     webActionUtil.enterData(EnterAdd2, "Owerri");
     webActionUtil.enterData(EnterAdd3, "Imo");
     webActionUtil.enterData(EnterCity, "Rough City");
     webActionUtil.enterData(EnterPostcode, "DT9 3DD");
     webActionUtil.clickOnElement(ClickSave);
    	Thread.sleep(2000);
    }
    
    
     
}
