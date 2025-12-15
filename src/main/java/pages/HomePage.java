package pages;

import java.util.List;

import javax.swing.JComboBox.KeySelectionManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='One way']")
	WebElement triponewayElement;

	@FindBy(xpath = "//input[@value='Round trip']")
	WebElement roundtripElement;

	public void TripSelect() {
		if (triponewayElement.isSelected()) {
			roundtripElement.click();
		} else {
			ElementClickable(triponewayElement);
		}

	}

	@FindBy(xpath = "//li[@class='select2-results__option'] ")List<WebElement> listfromElements;
	@FindBy(id="chat-bot-message-close") WebElement closElement;
	@FindBy(id="chat-bot-message-container") WebElement chatbotElement;
	public void selectFromDropdownByIndex(int index, String valueToSelect) {

	    WebElement dropdown = driver.findElement(By.xpath("(//span[@class='selection']/child::span)[" + index + "]"));

	    scrollToElement(dropdown);
	    ElementVisble(dropdown);
	    dropdown.click();
	    
	    Actions actions= new Actions(driver);
	    actions.moveToElement(chatbotElement);
	    ElementVisble(closElement);
	    ElementClickable(closElement);
	    
	    for (WebElement option : listfromElements) {
	        if (option.getText().trim().contains(valueToSelect)) {
	            option.click();
	            break;
	        }
	    }
	}

	
	
//	
//	@FindBy(xpath = "(//span[@class='selection']/child::span)[1]")WebElement fromElement;
//	@FindBy(xpath = "(//span[@class='selection']/child::span)[2]")	WebElement destinationElement;
//	@FindBy(xpath = "(//span[@class='selection']/child::span)[3]")WebElement adultsElement;
//
//
//	public void FromAndTo() {
//
//		scrollToElement(fromElement);
//
//		fromElement.click();
//		for (WebElement list : listfromElements) {
//			if (list.getText().contains("New Delhi")) {
//				list.click();
//				break;
//
//			}
//		}
//
//		scrollToElement(destinationElement);
//		destinationElement.click();
//
//		for (WebElement list : listfromElements) {
//			if (list.getText().contains("Chennai")) {
//				list.click();
//				break;
//
//			}
//		}
//
//		
//		scrollToElement(adultsElement);
//		adultsElement.click();
//
//		for (WebElement list : listfromElements) {
//			if (list.getText().contains("2")) {
//				list.click();
//				break;
//
//			}
//		}
//	}

}
