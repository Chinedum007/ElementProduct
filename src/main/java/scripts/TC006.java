package scripts;

import org.testng.annotations.Test;

import pages.DeleteContact;

public class TC006 extends BaseTest{
	
	@Test(description="As an Admin I want to be able to delete contact")
	
	public void deletecontact() throws InterruptedException {
		DeleteContact DC = new DeleteContact(driver, webActionUtil);
		DC.deleteContact();
	}

}
