import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import UtilityCommon.UtilityCommon;

public class BaseClass {
	static  WebDriver driver1 ;
	UtilityCommon objutilityCommon;
	
 
	@BeforeTest
	 public void beforeTest() {
	UtilityCommon objutilitycommon=new UtilityCommon();
	 driver1= objutilitycommon.web("https://qabible.in/erp/","chrome");
	 }
@AfterTest
public void afterTest() throws InterruptedException {

	objutilityCommon.implicitywait();
driver1.quit();
}
}

