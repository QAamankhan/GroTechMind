package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class OpenUrlForTesting extends BaseTest{
	
	
	HomePage hp;
	@BeforeMethod
	public void ObjectCreation() {
		hp= new HomePage(driver);
	}
	
	@Test
	public void TC01_TripSelect() {
		hp.TripSelect();
		
		hp.selectFromDropdownByIndex(1,"New Delhi");
		hp.selectFromDropdownByIndex(2,"Chennai");
		hp.selectFromDropdownByIndex(3,"3");
	}
}

