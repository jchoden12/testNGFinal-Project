package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCatagoryPage extends BasePage {
	WebDriver driver;

	public AddCatagoryPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement ADD_CATAGORY_FIELD_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "div[class='controls']")
	WebElement CATAGORIES_PAGE_ELEMENT;
	@FindBy(how = How.CSS, using = " div.controls >a:nth-last-child(3)")
	WebElement CATAGORIES_ELEMENT;

	// body > div.controls > a:nth-child(i)
	// body > div.controls > a:nth-child(362)

	String enteredName;

	public void AddCatagoryName(String data) {

		int generatedNumber = generateRandomNumber(999);
		enteredName = data + generatedNumber;
		ADD_CATAGORY_FIELD_ELEMENT.sendKeys(enteredName);
		ADD_BUTTON_ELEMENT.click();

	}

//	public void verifyEnteredCatagory(String data) {
//
//		String a = CATAGORIES_PAGE_ELEMENT.getText();
//		if (a.contains(data)) {
//			System.out.println("catagory added is displayed ");
//		}
//
//	}

	public void verifyEnteredCatagory() {

		String addedName = CATAGORIES_ELEMENT.getText();
		System.out.println(addedName);
		Assert.assertEquals(addedName, enteredName, "the enterName is not Displayed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
