package test.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
    	WebDriver wd = new FirefoxDriver();
    	try
    	{
    		System.out.println("opening google");
	    	wd.get("https://google.com");	
    		System.out.println("click on login");
	    	wd.findElement(By.id("gb_70")).click();

	    	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		System.out.println("writing");
	    	wd.findElement(By.id("identifierId")).sendKeys("carlosge13@gmail.com");;
	    	
	    	wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    		System.out.println("click on next");
	    	wd.findElement(By.id("identifierNext")).click();
	    	
	    	wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	    	Thread.sleep(2000);
	    	WebElement pass = wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/div[1]/div/div[1]/div/div[1]/input"));
//    		System.out.println("clicking password");
//	    	pass.click();
	    	System.out.println("wating");
	    	wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    		System.out.println("writing password");
	    	pass.sendKeys("@545mn217CAGE");
	    	wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    		System.out.println("clicking next");
	    	wd.findElement(By.id("passwordNext")).click();
	    	
    		wd.close();
    		
    		wd.quit();
    	}
    	catch(Exception e) 
    	{
    		System.out.println(e.getMessage().toString());
    	}
    	finally 
    	{    		
    		System.out.println("done...");
    	}
    }
}
