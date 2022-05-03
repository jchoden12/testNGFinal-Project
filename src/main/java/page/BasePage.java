package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	public void selectFromDropDown(WebElement element) {
		
		Select sel = new Select(element);
		List<WebElement> month = sel.getOptions();
		System.out.println(month);
		
		
	}
	
	public int generateRandomNumber(int boundaryNumber) {
		
		Random rand = new Random();
		 return rand.nextInt( boundaryNumber);
		
	}

}
