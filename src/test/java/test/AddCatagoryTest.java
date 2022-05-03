package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowserFactory;

public class AddCatagoryTest {

	WebDriver driver;
	
	// Test data
	String data ="JC";

	//Validate a user is able to add a category and once the category is added it should display.
	@Test

	public void validatedAddCatagory() throws Throwable {
		
		driver = BrowserFactory.init();

		AddCatagoryPage addCatagory = PageFactory.initElements(driver, AddCatagoryPage.class);

		addCatagory.AddCatagoryName(data);
		Thread.sleep(2000);
		
		addCatagory.verifyEnteredCatagory()  ;
		BrowserFactory.tearDown();
	}
}
