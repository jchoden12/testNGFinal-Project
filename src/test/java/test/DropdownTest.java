package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page.DropdownPage;
import util.BrowserFactory;

public class DropdownTest {
	WebDriver driver;
	
	@Test
	public void validateDropDownButton() {
		
		driver = BrowserFactory.init();
		DropdownPage dropdownPage = PageFactory.initElements(driver, DropdownPage.class);
		dropdownPage.clickOnMonthDropdownButton();
		dropdownPage.verifyTheDropdownButton();
		
		BrowserFactory.tearDown();
		
	}
	

}
