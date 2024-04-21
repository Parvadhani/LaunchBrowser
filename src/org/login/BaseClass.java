package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
  public void browserLaunch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://velayuthanadarsweets.com/");
	    driver.manage().window().maximize();
  }
		
		
	
}
