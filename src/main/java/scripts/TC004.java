package scripts;

import org.testng.annotations.Test;

import pages.AddStaffAvailability;

public class TC004 extends BaseTest {

	@Test(description="As an Admin I want to be able to manage staff availability")
	
	public void addstaffavailability() throws InterruptedException {
		AddStaffAvailability ASA = new AddStaffAvailability(driver, webActionUtil);
		ASA.addStaffAvailability();
	}
}
