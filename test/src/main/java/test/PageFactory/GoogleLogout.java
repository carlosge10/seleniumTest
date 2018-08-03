package test.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLogout {
	
	WebDriver wd; 
	
	@FindBy(xpath="/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[4]/div[1]/a/span") public WebElement userbtn;
//	userbtn
	///html/body/div/div[3]/div[1]/div/div/div/div[2]/div[4]/div[1]/a/span
	
	@FindBy(xpath="//*[@id=\"gb_71\"]") public WebElement logoutbtn;
//	logoutbtn
	////*[@id="gb_71"]
	
	@FindBy(xpath="//*[@id=\"gb_70\"]") public WebElement proof;
	
	
	public GoogleLogout(WebDriver ws) 
	{
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
	
	public void logout() throws Exception
	{
		userbtn.click();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(1000);
		logoutbtn.click();
		
	}
	
}
