package myproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.UtilityCommon;

public class ExcelLoginPage {
	static  WebDriver driver ;
	//public void ExcelRead() throws InterruptedException, IOException 
//{	
		UtilityCommon read=new UtilityCommon();
		@FindBy(id="loginform-username")
		public WebElement Username;
		@FindBy(id="loginform-password")	
		public WebElement Password ;
		
		//UtilityCommon.handleSleep(6000);
		@FindBy(xpath="//*[@name='login-button']")
		public WebElement Login;
		//UtilityCommon.handleSleep(6000);
		
		
		
		//WebElement Username = driver1.findElement(By.id("loginform-username"));
		//Username.sendKeys(read.ReadExcel1(0, 0));
		//WebElement Password = driver1.findElement(By.id("loginform-password"));
		//Password.sendKeys(read.ReadExcel1(1, 0));
		//UtilityCommon.handleSleep(6000);
		//WebElement Login = driver1.findElement(By.xpath("//*[@name='login-button']"));
		//Login.click();
		//UtilityCommon.handleSleep(6000);
		
		

public ExcelLoginPage(WebDriver driver1) {
	//this.driver2=driver1;
	//PageFactory.initElements(driver2, this);
	


//WebDriver driver;
//public   PageElement(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	
}
}

