package UtilityCommon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageElement {

	WebDriver driver;
	public   PageElement(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
}
