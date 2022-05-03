package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DuplicateCatagoryPage {
	
	WebDriver driver;
	
	public DuplicateCatagoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements;
	@FindBy(how = How.CSS, using = "input[name='categorydata']") WebElement ADD_CATAGORY_FIELD_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "body") WebElement DUPLICATE_TEXT_MESSAGE_ELEMENT;
	@FindBy(how = How.CSS, using = " div.controls >a:nth-last-child(3)") WebElement CATAGORY_ELEMENT;
	
	
	public void addSameCatagoryName() {
		
		String enteredCatagoryName = CATAGORY_ELEMENT.getText();
		ADD_CATAGORY_FIELD_ELEMENT.sendKeys(enteredCatagoryName);		
		ADD_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
			}
	
	public void verifyDuplicateCatagoryMessage() {
		
		String errorMessage = (DUPLICATE_TEXT_MESSAGE_ELEMENT.getText());
		if(errorMessage.contains("The category you want to add already exists")) {
			
			System.out.println("error message is displayed");
			
		}
	}
	

}
