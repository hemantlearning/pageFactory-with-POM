package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages_Methods.HomePage_Methods;
import pages_Methods.HomePage_Methods2;
import project_Base.Base_Class;
import project_Utilities.ExcelDataReader;

public class HomePage_Test3 extends ExcelDataReader
{
 
	@BeforeMethod
	public void launchApplication() {
		Base_Class.Initialization();
	}
	
	@Test(dataProvider = "TestDataDrivenHomePage")
	public void Test(String Menu) {
		//HomePage_Methods methods = new HomePage_Methods();
		HomePage_Methods2 methods = new HomePage_Methods2();
		boolean MenuIsDisplayed = methods.checkMenuIsDisplayed(Menu);
		Assert.assertEquals(MenuIsDisplayed, true);
		System.out.println("Passed : "+Menu);
	}
	
	
	
	@AfterMethod
	public void closeApplication() {
		Base_Class.tearDownTest();
	}
	
}
