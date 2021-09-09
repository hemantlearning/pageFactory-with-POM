package pages_Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages_UI.Home_Page;
import project_Base.Base_Class;

public class HomePage_Methods extends Base_Class
{
	public boolean checkMenuIsDisplayed(String Menu) 
	{
		WebElement MenuOption = null;

		if(Menu.equals("Men")) {
			MenuOption = Home_Page.MenuOption_Men(driver);
		}
		else if(Menu.equals("Women"))
		{
			MenuOption = Home_Page.MenuOption_Women(driver);
		}
		else if(Menu.equals("Kids"))
		{
			MenuOption = Home_Page.MenuOption_Kids(driver);
		}
		else if(Menu.equals("HL"))
		{
			MenuOption = Home_Page.MenuOption_HL(driver);
		}
		else if(Menu.equals("Beauty"))
		{
			MenuOption = Home_Page.MenuOption_Beauty(driver);
		}
		else if(Menu.equals("Topwear")) 
		{
			Actions a = new Actions(driver);
			a.moveToElement(Home_Page.MenuOption_Men(driver)).build().perform();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MenuOption = Home_Page.MenuOption_Topwear(driver);
			
		}
		else if(Menu.equals("RainJackets"))
		{
			Actions a = new Actions(driver);
			a.moveToElement(Home_Page.MenuOption_Men(driver)).build().perform();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MenuOption = Home_Page.MenuOption_RainJackets(driver);
		}
		
		else if(Menu.equals("SearchBar"))
		{
			MenuOption = Home_Page.MenuOption_SearchBar(driver);
		}


		if(MenuOption == null) {
			return false;
		}
		else if (MenuOption.isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	
	
}
