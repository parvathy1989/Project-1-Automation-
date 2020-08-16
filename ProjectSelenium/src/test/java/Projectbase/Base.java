package Projectbase;

import UtilityCommon.UtilityCommon;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {
	static  WebDriver driver1 ;
	UtilityCommon objutilityCommon;
	
	@BeforeTest
	 public static WebDriver beforeTest() {
	UtilityCommon objutilitycommon=new UtilityCommon();
	 driver1= objutilitycommon.web("https://qabible.in/erp/","chrome");
		return driver1;
	 }

	@AfterTest
	public void afterTest() throws InterruptedException {

		objutilityCommon.implicitywait();
	driver1.close();
	}
	}