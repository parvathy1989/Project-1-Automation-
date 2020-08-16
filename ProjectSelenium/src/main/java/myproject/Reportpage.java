package myproject;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reportpage {
	static  WebDriver driver;
	@FindBy(xpath="/html/body/div/aside/section/ul/li[6]/a/span")
	public WebElement report ;
	@FindBy(xpath="//*[@class='glyphicon glyphicon-calendar kv-dp-icon']")
	public WebElement calenderreport ;	
	@FindBy(xpath="/html/body/div[2]/div[2]/table/tbody/tr/td/span[5]")
	public WebElement monthreport ;
	@FindBy(xpath="//*[@class='btn btn-success']")	
	public WebElement findbutton;
	


	public Reportpage(WebDriver driver1) {
		//this.driver2=driver1;
				//PageFactory.initElements(driver2, this);
				
			

			//WebDriver driver;
			//public   PageElement(WebDriver driver1) {
				this.driver=driver1;
				PageFactory.initElements(driver, this);
	}
		// TODO Auto-generated constructor stub
	}



