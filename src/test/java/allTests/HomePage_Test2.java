package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages_Methods.HomePage_Methods;
import project_Base.Base_Class;
import project_Utilities.ExcelDataReader;

public class HomePage_Test2 extends ExcelDataReader
{
 
	@BeforeMethod
	public void launchApplication() {
		Base_Class.Initialization();
	}
	
	@Test(dataProvider = "TestDataDrivenHomePage")
	public void Test(String MenuName) {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed(MenuName);
		Assert.assertTrue(checkStatus);
	}
	
	
	
	@AfterMethod
	public void closeApplication() {
		Base_Class.tearDownTest();
	}
	
}
