package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages_Methods.HomePage_Methods;
import project_Base.Base_Class;

public class HomePage_Test 
{
 
	@BeforeMethod
	public void launchApplication() {
		Base_Class.Initialization();
	}
	
	@Test
	public void Test1() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Kids");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test2() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Men");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test3() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Women");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test4() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Topwear");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test5() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("RainJackets");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test6() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("HL");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test7() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Beauti");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test8() {
		HomePage_Methods methods = new HomePage_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("SearchBar");
		Assert.assertTrue(checkStatus);
	}
	
	
	
	@AfterMethod
	public void closeApplication() {
		Base_Class.tearDownTest();
	}
	
}
