package project_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import project_Drivers.SelectDriver;
import project_Utilities.All_Constants;

public class Base_Class 
{
	public static WebDriver driver;
	public static Properties prop;
		
	public static void Initialization() {
		try {
		prop = new Properties();
		FileInputStream fis = new 
				FileInputStream(All_Constants.PropertiesFilePath);
		System.out.println("Properties file path is : "
		+All_Constants.PropertiesFilePath);
		
		prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browser");
		SelectDriver.driverInitialize(browserName);
		driver.get(prop.getProperty("url"));
	}
	
	public static void tearDownTest() {
		driver.quit();
	}
}

