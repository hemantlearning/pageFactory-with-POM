package project_Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import project_Base.Base_Class;
import project_Utilities.All_Constants;
import project_Utilities.Timeouts;

public class SelectDriver extends Base_Class
{
	public SelectDriver() throws Exception {
		super();
	}

	@SuppressWarnings("deprecation")
	public static void driverInitialize(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", All_Constants.ChromeDriverFilePath);
			driver= new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", All_Constants.FirefoxDriverFilePath);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	        capabilities.setCapability("marionette",true);
	        driver= new FirefoxDriver(capabilities);  
		}
		else if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", All_Constants.IEDriverFilePath);
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Browser not found");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timeouts.SMALL, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Timeouts.LARGE, TimeUnit.SECONDS);
	}

}
