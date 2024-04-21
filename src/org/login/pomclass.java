package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.login.BaseClass;

public class pomclass extends BaseClass
{
	
	public pomclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//button[@id='onesignal-slidedown-cancel-button']")
	public static  WebElement cancelbutton;
	
	@FindBy(xpath="//span[text()='Shop']")
	public static WebElement shop;
	
	@FindBy(xpath="//a[text()='Dhal Mixer']")
	public static WebElement dhalMixer;
	
	@FindBy(xpath="//li[@class='swatch swatch-label swatch-500g']")
	public static WebElement dhalMixer500;
	
	@FindBy(xpath="//button[@class='single_add_to_cart_button button alt wp-element-button']")
	public static WebElement dhalMixerAddtoCart;
	
	
	
	 
	
	
	
	
}
