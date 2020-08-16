package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.PageElement;

public class LoginPage {
	static  WebDriver driver ;
	//PageElement obj=new PageElement(driver1);
	


		@FindBy(id="loginform-username")
		WebElement usernametext;

		@FindBy(id="loginform-password")
		WebElement passwordtext;

		@FindBy(name="//*[@name='login-button']")
		WebElement loginbutton;

		public boolean setEnableuser()
		{
			boolean text1=usernametext.isEnabled();
			return text1;
		}

		public void setUsername(String username)
		{
			usernametext.sendKeys(username);
		}


		public boolean setEnablepassword()
		{
			boolean text2=passwordtext.isEnabled();
			return text2;
		}
		public void setPassword(String password)
		{
			passwordtext.sendKeys(password);
		}

		public void loginclick()
		{
			loginbutton.click();
		}
		public LoginPage(WebDriver driver1) {
			//this.driver2=driver1;
			//PageFactory.initElements(driver2, this);
			


		//WebDriver driver;
		//public   PageElement(WebDriver driver1) {
			this.driver=driver1;
			PageFactory.initElements(driver, this);
			
		}

	}


