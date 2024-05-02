package scripts;

import org.testng.annotations.Test;

import pages.DeleteBooking;

public class TC003 extends BaseTest{

	@Test(description="As a user I want to be able to delete a booking")
	
	public void dEleteBooking() throws InterruptedException {
		
		DeleteBooking DB= new DeleteBooking(driver, webActionUtil);
		DB.deleteBooking();
	}
}
