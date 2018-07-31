package test.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Testwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\CARLOSALFREDOGONZALE\\selenium\\gekodriver\\geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		wd.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		wd.findElement(By.xpath("//*[@id=\"timingAlert\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(wd, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("timingAlert")));
		
		System.out.println(element.getText().toString());

	}

}
