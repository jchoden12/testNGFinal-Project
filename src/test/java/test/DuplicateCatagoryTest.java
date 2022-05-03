package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DuplicateCatagoryPage;
import util.BrowserFactory;

public class DuplicateCatagoryTest {
	
	WebDriver driver;
	
	
	@Test
	public void validateUserCannotAddDuplicateCatagory() {
		
		driver = BrowserFactory.init();
		DuplicateCatagoryPage duplicateCatagoryPage = PageFactory.initElements(driver, DuplicateCatagoryPage.class);
		duplicateCatagoryPage.addSameCatagoryName();
		duplicateCatagoryPage.verifyDuplicateCatagoryMessage();
		BrowserFactory.tearDown();

	}

}
