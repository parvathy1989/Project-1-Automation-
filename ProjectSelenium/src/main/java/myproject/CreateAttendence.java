package myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityCommon.PageElement;

public class CreateAttendence {
	
	static  WebDriver driver ;
	
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a/i")
	public WebElement CreateAttendance ;
	@FindBy(xpath="//*[@class='glyphicon glyphicon-calendar kv-dp-icon']")	
	public WebElement Calendarcreate ;	
	@FindBy(xpath="/html/body/div[2]/div[1]/table/tbody/tr[5]/td[2]")
	public WebElement DateCreate;
	@FindBy(xpath="//*[@class='btn btn-success']")	
	public WebElement createbutton ;	
	@FindBy(xpath="//*[@id='uploadform-file']")	
	public WebElement browsebutton;	
	
	public void browse() {
		  Actions builder = new Actions(driver);
		  builder
		  	.moveToElement(browsebutton)
		  	.click()
		  	.keyDown(browsebutton, Keys.SHIFT)
		  	//.sendKeys(browsebutton, "C:\\\\Users\\\\sasis\\\\Desktop\\\\Screenshot\\\\Book1.xlsx")
		  	.keyUp(browsebutton, Keys.SHIFT)
		  	.doubleClick(browsebutton)
		  	.contextClick()		  	
		  	.build().perform();
		  
	}
public void download() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);

}


	public CreateAttendence(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
}
		


