package myproject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.PageElement;

public class Logoutpage {
	static  WebDriver driver ;
	
	
	
	
	@FindBy(xpath="/html/body/div/header/nav/div/ul/li[8]/a")	
	public WebElement profile  ;	
	@FindBy(xpath="//*[@class='logout-btn']")	
	public WebElement logout;	
	
	public Logoutpage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		
	}


}
