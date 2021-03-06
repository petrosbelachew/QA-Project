package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String []args) throws InterruptedException
	{
		
		//System.setProperty("webdriver.gecko.driver",  "./Drivers/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		
		driver.get("https://google.com");
		
		/*WebElement SearchBox=driver.findElement(By.name("q"));
		//SearchBox.sendKeys("Automation",Keys.ENTER);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options=driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element:options)
		{
			System.out.println(element.getText());
		}
		*/
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton	=driver.findElement(By.id("btnLogin"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}


}
