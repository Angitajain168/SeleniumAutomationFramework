package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.tools.sjavac.Log;

public class LoginPage {
	
	private WebDriver driver;
	
	private By searchBox = By.xpath("//input[@placeholder='Search Amazon.in']");
	private By searchIcon = By.id("nav-search-submit-button");

	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		
	}
 public void searchbox (String search) {
	 
	 driver.findElement(searchBox).click();
	 driver.findElement(searchBox).sendKeys(search);
 }
 public void searchicon () {
		Log.info("Clicking Search button");
	 driver.findElement(searchIcon).click();

 }

}
