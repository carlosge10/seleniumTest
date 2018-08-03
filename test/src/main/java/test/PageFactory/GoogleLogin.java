package test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLogin {
	
	private WebDriver wd;
	
	public GoogleLogin(WebDriver wd) {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span") public WebElement nextBtn;
	@FindBy(xpath="//*[@id=\"identifierId\"]") public WebElement username;
	public String strUsername = "carlosge13@gmail.com";
	public void writeUsername() throws Exception 
	{
		username.sendKeys(strUsername);
		nextBtn.click();
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/content/span") public WebElement nextBtn2;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/div[1]/div/div[1]/div/div[1]/input") public WebElement password;
	public String strPassword = "154ns154CAGE";
	public void writePassword() throws Exception
	{
		password.sendKeys(strPassword);
		nextBtn2.click();
	}
	
	@FindBy(xpath="/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[4]/div[1]/a") public WebElement proof;
	
	@FindBy(xpath="//*[@id=\"password\"]/div[2]/div[2]") public WebElement proofIncorrectPassword;
	
}
