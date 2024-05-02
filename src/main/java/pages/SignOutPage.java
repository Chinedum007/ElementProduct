package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.WebActionUtil;

public class SignOutPage extends BasePage {

	public SignOutPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}

	@FindBy(xpath="//div[@id='menuprofile'] ")
	private WebElement HoverAroundName;
	
	@FindBy(xpath="//a[@href='/BookWiseEducationV7/Account/LogOff']")
	private WebElement logOffButton;
	
	public void LogOut() throws InterruptedException {
		webActionUtil.moveToElement(HoverAroundName);
		Thread.sleep(2000);
		webActionUtil.clickOnElement(logOffButton);
	}
}
