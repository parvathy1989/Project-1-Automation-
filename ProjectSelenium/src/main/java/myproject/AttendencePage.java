package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.PageElement;
import UtilityCommon.UtilityCommon;

public class AttendencePage {
	static  WebDriver driver;

	
	
	@FindBy(xpath="//*[@title='Jobs']")
	public WebElement Jobs;
	@FindBy(xpath="//*[@href='/erp/attendances']")	
	public WebElement Attendance1 ;	
	@FindBy(xpath="//*[@title='Select date']")
	public WebElement calender;
	@FindBy(xpath="//*[@data-date='1597017600000']")	
	public WebElement date;	
	@FindBy(xpath="//*[@type='submit']")	
	public WebElement startbutton;	
	
	public AttendencePage(WebDriver driver1) {
		//this.driver2=driver1;
		//PageFactory.initElements(driver2, this);
		
	

	//WebDriver driver;
	//public   PageElement(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
