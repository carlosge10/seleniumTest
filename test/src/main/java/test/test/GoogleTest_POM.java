package test.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.PageFactory.GoogleHomePage;
import test.PageFactory.GoogleLogin;

public class GoogleTest_POM {
	
	GoogleHomePage home;
	GoogleLogin login;
	
	WebDriver wd;
	
	@Before
	public void init() 
	{
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		this.wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com");
	}
/*
	@Test
	public void testHome() {
		System.out.println("testing home...");
		try {
			home = new GoogleHomePage(this.wd);			
			assertEquals("Google", wd.getTitle());
			home.signin.click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}
	
	@Test
	public void testLogin() {
		System.out.println("testing login...");
		try {		
			login = new GoogleLogin(this.wd);
			login.writeUsername();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			login.writePassword();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);			
			assertTrue(login.proof.getAttribute("title").contains("carlos"));
		}
		
		catch(Exception e) 
		{
			System.out.println(e.getMessage().toString());
		}
		
	}
	
*/
	
	@Test
	public void testAll() {
		System.out.println("testing home...");
		try {
			home = new GoogleHomePage(this.wd);			
			assertEquals("Google", wd.getTitle());
			home.signin.click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
		
		System.out.println("testing login...");
		
			login = new GoogleLogin(this.wd);
			login.writeUsername();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			login.writePassword();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);			
			assertTrue(login.proof.getAttribute("title").contains("carlos"));
		}
		
		catch(Exception e) 
		{
			System.out.println(e.getMessage().toString());
			fail(e.getMessage().toString());
		}
	}
	
	@Test
	public void testLogout()
	{
		/*
		 * ICH VERSTEHE :) 
		 * */
	}
	
	@After
	public void end() 
	{
		wd.close();
	}

}
