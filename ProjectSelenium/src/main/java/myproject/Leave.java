package myproject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave {
	static WebDriver driver ;
	
	
	@FindBy(xpath="/html/body/div[1]/aside/section/ul/li[4]/a/span")
	public WebElement leave ;
	@FindBy(xpath="//*[@id=\"leaveform-date_range-container\"]/div/input")	
	public WebElement calenderleave ;	
	@FindBy(xpath="//*[@class='cancelBtn btn btn-sm btn-default']")	
	public WebElement cancelbutton ;	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[5]")
	public WebElement dateleave1 ;	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[6]")	
	public WebElement dateleave2;	
	@FindBy(xpath="/html/body/div[2]/div[4]/button[2]")	
	public WebElement applybutton ;		
	@FindBy(xpath="//*[@id='select2-leaveform-worker-container']")	
	public WebElement worker;		
	@FindBy(xpath="/html/body/span/span/span[1]/input")	
	public WebElement workername ;	
	@FindBy(xpath="//*[@id='leaveform-reason']")	
	public WebElement reason ;
	

	public Leave(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
}


