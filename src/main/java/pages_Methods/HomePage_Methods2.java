package pages_Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages_UI.Home_Page2;
import project_Base.Base_Class;

public class HomePage_Methods2 extends Base_Class
{
	@SuppressWarnings("static-access")
	public boolean checkMenuIsDisplayed(String Menu) 
	{
		WebElement MenuOption = null;
		Home_Page2 homepage2 = new Home_Page2(driver);
		if(Menu.equals("Men")) {
			MenuOption = homepage2.Men;
		}
		else if(Menu.equals("Women"))
		{
			MenuOption = homepage2.Women;
		}
		else if(Menu.equals("Kids"))
		{
			MenuOption = homepage2.Kids;
		}
		else if(Menu.equals("HL"))
		{
			MenuOption = homepage2.HL;
		}
		else if(Menu.equals("Beauty"))
		{
			MenuOption = homepage2.Beauty;
		}
		else if(Menu.equals("Topwear")) 
		{
			Actions a = new Actions(driver);
			a.moveToElement(homepage2.Men).build().perform();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MenuOption = homepage2.Topwear;
			
		}
		else if(Menu.equals("RainJackets"))
		{
			Actions a = new Actions(driver);
			a.moveToElement(homepage2.Men).build().perform();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MenuOption = homepage2.RainJackets;
		}
		
		else if(Menu.equals("SearchBar"))
		{
			MenuOption = homepage2.SearchBar;
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
