package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverLaunch extends BaseClass
{

	public static void main(String[] args) throws InterruptedException
	{
		BaseClass b=new BaseClass();
		b.browserLaunch();
	    Thread.sleep(3000);
	    
	
	pomclass.cancelbutton.click();
	
	pomclass.shop.click();
	pomclass.dhalMixer.click();
	pomclass.dhalMixer500.click();
	pomclass.dhalMixerAddtoCart.click();
	
	}

}
