package scripts;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pages.AddBooking;

public class TC002 extends BaseTest{
	
@Test(description="As a User I want to be able to make a booking")

public void CreateABooking() throws InterruptedException {
	
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	AddBooking AB =new AddBooking(driver, webActionUtil,opt);
     AB.addBooking();
}
}