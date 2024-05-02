package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class AddStaffAvailability extends BasePage{

	public AddStaffAvailability(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	@FindBy(css="#menu > li:nth-child(9)")
	private WebElement HoverMouseToAdmin;
	
	@FindBy(xpath="//a[@href='/BookWiseEducationV7/Admin/StaffAvailability']")
	private WebElement ClickOnManageStaffAvailability;
	
    @FindBy(id="new")
    private WebElement ClickOnNewStaffAvailabiityBtn;
    @FindBy(id="userDropDown")
    private WebElement SelectNameFromDropDown;
    
    @FindBy(id="reason")
    private WebElement EnterReason;
    @FindBy(id="saveStaffAvail")
    private WebElement ClickSaveBtn;
    @FindBy(xpath="//button[@class='btn btn-primary BMPDispose']")
    private WebElement ClickOkBtn;
    
    public void addStaffAvailability() throws InterruptedException {
    webActionUtil.moveToElement(HoverMouseToAdmin);
    Reporter.log("Hover mouse to admin tab");
    
    webActionUtil.clickOnElement(ClickOnManageStaffAvailability);
    Thread.sleep(2000);
    Reporter.log("Click on manage staff availability");
    webActionUtil.clickOnElement(ClickOnNewStaffAvailabiityBtn);
    Reporter.log("Click New button to enter staff details");
    Thread.sleep(3000);
    webActionUtil.selectByTextInListBox(SelectNameFromDropDown, "Chinedum Nwaozuzu");
    webActionUtil.enterData(EnterReason, "On Holiday");
    webActionUtil.clickOnElement(ClickSaveBtn);
    webActionUtil.clickOnElement(ClickOkBtn);
    Reporter.log("Click Save and Ok button to save staff detail");
    }
}
