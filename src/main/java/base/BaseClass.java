package base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	JavascriptExecutor js ;
	Alert alert;
	Actions action;

	public BaseClass(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void ElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void ElementVisble(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void scrollToElement(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public String waitForAlert() {
	    wait.until(ExpectedConditions.alertIsPresent());
	    alert = driver.switchTo().alert();
	    String msg=alert.getText();
	    alert.accept();
	    return msg;
	} 
	
	
	public void Hover(WebDriver driver,WebElement element) {
		this.driver=driver;
		action= new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
}
