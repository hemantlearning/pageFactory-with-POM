package pages_UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page2 
{
	protected WebDriver dr;
	
	@FindBy(xpath="(//a[contains(text(),'Men')])[1]")public static WebElement Men;
	@FindBy(xpath="//a[contains(text(),'Women')]")public static WebElement Women;
	@FindBy(xpath="//a[contains(text(),'Topwear')]")public static WebElement Topwear;
	@FindBy(xpath="//a[contains(text(),'Rain Jackets')]")public static WebElement RainJackets;
	@FindBy(xpath="(//a[contains(text(),'Kids')])[1]")public static WebElement Kids;
	@FindBy(xpath="(//a[contains(text(),'Home & Living')])[1]")public static WebElement HL;
	@FindBy(xpath="(//a[contains(text(),'Beauty')])[3]")public static WebElement Beauty;
	@FindBy(xpath="//input[@class='desktop-searchBar']")public static WebElement SearchBar;
	
	public Home_Page2(WebDriver driver) {
		this.dr=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
}
