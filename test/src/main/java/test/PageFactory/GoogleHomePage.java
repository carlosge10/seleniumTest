package test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

private WebDriver wd;
	
	public GoogleHomePage(WebDriver wd) {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//*[@id=\"gb_70\"]") 
	public WebElement signin;
	
}
