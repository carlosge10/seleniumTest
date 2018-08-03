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
import test.PageFactory.GoogleLogout;

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
	public void testLoginHappyPath() {
		System.out.println("Testing Happypath...");
		try {
		System.out.println("testing home...");
			
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
			
		System.out.println("testing logout...");

			GoogleLogout logout = new GoogleLogout(this.wd);
			logout.logout();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			System.out.println(logout.proof.getText().toLowerCase());
			
			assertTrue(logout.proof.getText().toLowerCase().contains("ses"));			
		}
		
		catch(Exception e) 
		{
			System.out.println(e.getMessage().toString());
			fail(e.getMessage().toString());
		}
		System.out.println("Happypath Done...");
	}
	
	@Test
	public void testLoginCorrectUserIncorrectPassword()
	{
		System.out.println("Testing Incorrect pass...");
		try {
			System.out.println("testing home...");
				
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
				
				//incorrect password
				login.strPassword = "estanoes";				
				
				login.writePassword();
				
				wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Thread.sleep(2000);			
				
				System.out.println(login.proofIncorrectPassword.getText());
				
				assertTrue(login.proofIncorrectPassword.getText().toUpperCase().contains("WRONG"));
							
			}
			
			catch(Exception e) 
			{
				System.out.println(e.getMessage().toString());
				fail(e.getMessage().toString());
			}
		
		System.out.println("Incorrect pass done...");
	}
	
	@After
	public void end() 
	{
		wd.close();
	}

}
