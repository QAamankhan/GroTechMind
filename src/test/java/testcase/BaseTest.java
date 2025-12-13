package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void OpenBrowser() throws Exception {
		ReadConfig rc = new ReadConfig();
		String url=rc.getUrl();
		String browser = rc.getBrowser();
		
		switch (browser.toLowerCase()) {
		case "chrome": driver= new ChromeDriver();
			break;
			
		case "firefox" : driver= new FirefoxDriver();
			break;
			
		case "edge" : driver = new EdgeDriver();
			break;
		
		default:
            throw new RuntimeException("Invalid browser name: " + browser);
		}
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	
//	@AfterMethod
//	public void TearDown() {
//		driver.close();
//	}
}
