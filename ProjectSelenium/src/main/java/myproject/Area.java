package myproject;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.PageElement;
import UtilityCommon.UtilityCommon;

public class Area {
	static  WebDriver driver ;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[8]/a/span")	
	public WebElement area ;
	@FindBy(xpath="	//*[@id=\"w0\"]/table/tbody/tr[1]/td[3]/a[1]/span")	
	public WebElement eyearea ;
	@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[3]/a[2]/span")	
	public WebElement penarea ;
	@FindBy(xpath="//*[@class='btn btn-success']")	
	public WebElement  createareabutton;
	@FindBy(xpath="//*[@id=\"area-name\"]")	
	public WebElement namearea ;	
	@FindBy(xpath="//*[@id=\"area-description\"]")	
	public WebElement descriptioncreatearea ;	
	@FindBy(xpath="//*[@id=\"w0\"]/div[3]/button")	
	public WebElement savebuttonarea;
	//@FindBy(xpath="/html/body/div/div/section[2]/div[1]/p")	
    //public WebElement areaupdatebutton ;
	//@FindBy(xpath="")	
	//public WebElement descriptionupdatearea  ;
	///@FindBy(xpath="//*[@id=\\\"w0\\\"]/div[3]/button")	
	//public WebElement saveareaagain ;
	
	
	public Area(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	


	
}
