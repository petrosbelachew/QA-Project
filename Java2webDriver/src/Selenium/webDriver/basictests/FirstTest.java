package Selenium.webDriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Users//petros//eclipse//java-2022-03//eclipse//geckodriver.exe");
	
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://10.18.3.5/User-Login?returnurl=%2f"); // Open Browser 
	
		WebElement username= (WebElement)driver.findElement(By.name("dnn$ctr19540$Login$Login_DNN$txtUsername"));
		username.sendKeys("dbu00983");
		
		WebElement password= (WebElement)driver.findElement(By.name("dnn$ctr19540$Login$Login_DNN$txtPassword"));
				password.sendKeys(" petros@*k");
	
		WebElement login= (WebElement)driver.findElement(By.name("login"));
				password.click();
				
	}

}
