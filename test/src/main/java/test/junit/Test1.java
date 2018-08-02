package test.junit;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		/*
		DesiredCapabilities cap = new DesiredCapabilities().firefox();
		cap.setCapability("version", "latest");
		
		this.driver = 
				new RemoteWebDriver(
						new URL("http://key:secret@hub.testingbot.com/wd/hub")
						,cap);
						*/
		this.driver = new FirefoxDriver();

	}
	
	@Test
	public void test() {
		this.driver.get("https://google.com");
		assertEquals("Google", this.driver.getTitle());
	}
	
	@After
	public void tearDown() throws Exception
	{
		this.driver.quit();
	}
}
