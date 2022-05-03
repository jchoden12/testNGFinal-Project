package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage{
	
	WebDriver driver;
	
	public DropdownPage(WebDriver driver) {
		this.driver = driver;
	}
	//Elements
	
	@FindBy(how = How.CSS,using = "select[name='due_month']") WebElement MONTH_DROPDOWN_BUTTON_ELEMENT;
	@FindBy(how = How.CSS,using = "select[name='due_month']") WebElement _DROPDOWN_ELEMENT;
	
	public void clickOnMonthDropdownButton() {
		MONTH_DROPDOWN_BUTTON_ELEMENT.click();
		waitForElement(driver, 2, MONTH_DROPDOWN_BUTTON_ELEMENT);
		
	}
	
	public void verifyTheDropdownButton() {
		
		String[] expected = {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		WebElement dropdown = MONTH_DROPDOWN_BUTTON_ELEMENT;
		Select sel =new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		for(WebElement month:options)  
		{  
		 System.out.println(month.getText());  
		} 
		
		
		
	}
	
	

}
