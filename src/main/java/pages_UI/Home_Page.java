package pages_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page 
{
	protected WebDriver driver;
	
	public Home_Page(WebDriver driver1) {
		this.driver=driver1;
	}
	
	private static By Men = By.xpath("(//a[contains(text(),'Men')])[1]");
	private static By Women = By.xpath("//a[contains(text(),'Women')]");
	private static By Topwear = By.xpath("//a[contains(text(),'Topwear')]");
	private static By RainJackets = By.xpath("//a[contains(text(),'Rain Jackets')]");
	private static By Kids = By.xpath("(//a[contains(text(),'Kids')])[1]");
	private static By HL = By.xpath("(//a[contains(text(),'Home & Living')])[1]");
	private static By Beauty = By.xpath("(//a[contains(text(),'Beauty')])[3]");
	private static By SearchBar = By.xpath("//input[@class='desktop-searchBar']");
	
	
	
	public static WebElement MenuOption_Men(WebDriver driver) {
		WebElement element = driver.findElement(Men);
		return element;
	}
	
	public static WebElement MenuOption_Women(WebDriver driver) {
		WebElement element = driver.findElement(Women);
		return element;
	}
	
	public static WebElement MenuOption_Topwear(WebDriver driver) {
		WebElement element = driver.findElement(Topwear);
		return element;
	}
	
	public static WebElement MenuOption_RainJackets(WebDriver driver) {
		WebElement element = driver.findElement(RainJackets);
		return element;
	}
	
	public static WebElement MenuOption_Kids(WebDriver driver) {
		WebElement element = driver.findElement(Kids);
		return element;
	}
	
	public static WebElement MenuOption_HL(WebDriver driver) {
		WebElement element = driver.findElement(HL);
		return element;
	}
	
	public static WebElement MenuOption_Beauty(WebDriver driver) {
		WebElement element = driver.findElement(Beauty);
		return element;
	}
	
	public static WebElement MenuOption_SearchBar(WebDriver driver) {
		WebElement element = driver.findElement(SearchBar);
		return element;
	}
}
