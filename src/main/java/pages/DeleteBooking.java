package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import generic.WebActionUtil;

public class DeleteBooking extends BasePage{

	public DeleteBooking(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
			
	}
	@FindBy(xpath="//a[text()='Search']")
	private WebElement ClickOnSearch;
	
	@FindBy(id="bookingTitle")
	private WebElement EnterBookingTitleNameInSearchBox;
	
	@FindBy(id="searchForBooking")
	private WebElement ClickOnSearchBtnToSearchForBookingTitle;
	
	@FindBy(xpath="//td[@class='e-rowcell e-templatecell e-lastrowcell']")
	private WebElement DoubleClickToSelectBooking;
	
	@FindBy(id="DeleteButton")
	private WebElement ClickOnDeleteBtn;
	
	@FindBy(id="confirmBookingDelete")
	private WebElement ClickOnConfirmBookingDelete;
	
	public void deleteBooking() throws InterruptedException {
		
		webActionUtil.clickOnElement(ClickOnSearch);
		Reporter.log("Click on search to enter page");
		webActionUtil.enterData(EnterBookingTitleNameInSearchBox, "Automation Test");
		Reporter.log("Enter booking title name in the search box");
		webActionUtil.clickOnElement(ClickOnSearchBtnToSearchForBookingTitle);
		Reporter.log("Click on search btn to search for booking");
		webActionUtil.doubleClick(DoubleClickToSelectBooking);
		Reporter.log("Double click to select booking");
		Thread.sleep(2000);
		webActionUtil.clickOnElement(ClickOnDeleteBtn);
		Reporter.log("Click delete btn to delete booking");
		webActionUtil.clickOnElement(ClickOnConfirmBookingDelete);
		Reporter.log("Click Yes to confirm booking delete");
		Reporter.log("Once booking is deleted logout and close browser");
	}
}
