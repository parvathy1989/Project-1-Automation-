package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidayPage {
	static  WebDriver driver ;
	
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[5]/a/i")
	public WebElement holiday ;
	@FindBy(xpath="//*[@class='btn btn-success']")	
	public WebElement createholidaybutton  ;	
	@FindBy(xpath="//*[@title='Select date']")
	public WebElement calenderholiday ;
	@FindBy(xpath=" /html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")	
	public WebElement dateholiday;	
	@FindBy(className="form-control")	
	public WebElement titleholiday ;	
	@FindBy(xpath="//*[@id='holiday-branch_id']")	
	public WebElement branch;	
	@FindBy(xpath="//*[@id=\"holiday-branch_id\"]/option[4]")	
	public WebElement  branchvalue;
	
	@FindBy(xpath=" //*[@id=\"holiday-description\"]")	
	public WebElement descriptionholiday ;
	@FindBy(xpath="//*[@id=\\\"holiday-status\\\"]")	
	public WebElement statusholiday ;
	@FindBy(xpath="//*[@id=\"w0\"]/div[15]/div/button")
	public WebElement savebutton ;
	@FindBy(xpath="//*[@class='btn btn-primary']")	
	public WebElement update  ;	
	@FindBy(xpath="//*[@id='holiday-description']")
	public WebElement descriptionholidayupdate ;
	@FindBy(xpath="//*[@id=\\\"w0\\\"]/div[15]/div/button ")	
	public WebElement savebuttonupdate ;	
	@FindBy(xpath="/html/body/div/div/section[2]/div[1]/p/a[2]")	
	public WebElement deletebutton ;
	
	public void status() {
		boolean statusholidayEnabled = driver.findElement(By.id("holiday-status")).isEnabled();
		
	      if (statusholidayEnabled==true )
	      {
	           
	      System.out.println("not enabled");//checkbox not enabled so click action done
	             WebElement checkbox1 = driver.findElement(By.id("holiday-status"));
	             checkbox1.click();
	      }
	}
	public HolidayPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	
	
	


	
	
	
	
	}



