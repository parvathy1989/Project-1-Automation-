package ProjectTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UtilityCommon.ReadExcel;
import UtilityCommon.UtilityCommon;
import myproject.Area;
import myproject.AttendencePage;
import myproject.CreateAttendence;
import myproject.CreateJobPage;
import myproject.ExcelLoginPage;
import myproject.HolidayPage;
import myproject.Leave;
import myproject.LoginPage;
import myproject.Logoutpage;
import myproject.Payroll;
import myproject.Reportpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ERP  {
	//private static final UtilityCommon objutilitycommon = null;
	//static  WebDriver driver1=beforeTest();
	public static WebDriver driver1;
	JavascriptExecutor js;
	 ReadExcel read=new ReadExcel();
  
  @Test(priority=1,enabled=true)
  public void testcase1() throws InterruptedException, IOException {
	  ExcelLoginPage ob2=new ExcelLoginPage(driver1);
	  ob2.Username.sendKeys(read.ReadExcel1(0, 0));
	  ob2.Password.sendKeys(read.ReadExcel1(1, 0));
	  ob2.Login.click();
	  Thread.sleep(4000);
	  String expected= "ERP | Dashboard";
	  String actual=driver1.getTitle();
	  Assert.assertEquals(actual, expected);
	 
  }
  @Test(priority=2,enabled=true)
  public void testcase3() throws InterruptedException {	 
	  AttendencePage ob3= new AttendencePage(driver1);
	  Thread.sleep(4000);
	  ob3.Jobs.click();
	  ob3.Attendance1.click();
	  Thread.sleep(3000);
	  String expected= "https://qabible.in/erp/attendances";
	  String actual=driver1.getCurrentUrl();
	  Assert.assertEquals(actual, expected); 
	  Thread.sleep(3000);
	  ob3.calender.click();
	  ob3.date.click();
	  ob3.startbutton.click();
	
  }
  @Test(priority=9,enabled=true)
  public void testcase4() throws InterruptedException, AWTException {
	  CreateAttendence ob4=new CreateAttendence(driver1);
	  Thread.sleep(1000);
      ob4.CreateAttendance.click();
      String expected= "https://qabible.in/erp/attendance/create";
	  String actual=driver1.getCurrentUrl();
	  Assert.assertEquals(actual, expected);
	  ob4.Calendarcreate.click();
	  ob4.DateCreate.click();
	  ob4.createbutton.click();
	  Thread.sleep(2000);
	// ob4.browse();
	 // driver1.navigate().to("https://qabible.in/erp/attendance/create");
  }
  @Test(priority=3,enabled=true)
  public void testcase5() throws InterruptedException, AWTException {	  
	  Leave ob5= new Leave(driver1);
	UtilityCommon objutilitycommon=new UtilityCommon();
	    Thread.sleep(3000);
	    ob5.leave.click();
	    Thread.sleep(1000);
	    ob5.calenderleave.click();
	    ob5.cancelbutton.click();
	    Thread.sleep(1000);
	    ob5.calenderleave.click();
		ob5.dateleave1.click();			
		ob5.dateleave2.click();			 
		ob5.applybutton.click();		
		ob5.worker.click();		
		ob5.workername.sendKeys("Sagar Alias Jacky");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		ob5.reason.click();		
		objutilitycommon.takescreenshot();
		ob5.reason.sendKeys("Family Function");
	  
  }
  @Test(priority=4,enabled=true) 
  public void testcase6() throws InterruptedException, AWTException{
	  UtilityCommon objutilitycommon=new UtilityCommon();
	  HolidayPage ob6=new HolidayPage(driver1);
	    Thread.sleep(3000);
	    ob6. holiday.click();	
	    String expected= "https://qabible.in/erp/holiday";
	    String actual=driver1.getCurrentUrl();
	    Assert.assertEquals(actual, expected);
		ob6.createholidaybutton.click();		
		ob6.calenderholiday.click();	
		ob6.dateholiday.click();		
		ob6.titleholiday.sendKeys("Sunday");		
		ob6.branch.click();		
		ob6.branchvalue.click();
		ob6.descriptionholiday.click();
		ob6.descriptionholiday.sendKeys("Sunday is a holiday");		
		ob6.status();
		ob6.savebutton.click();
		ob6.descriptionholidayupdate.click();
		ob6.descriptionholiday.clear();
		ob6.descriptionholiday.sendKeys("Public holiday!");
		ob6.savebutton.click();
		objutilitycommon.takescreenshot();
  }
 
  @Test(priority=5,enabled=true)
  public void testcase7() throws InterruptedException{
	  Reportpage ob7=new Reportpage(driver1);
	
	    Thread.sleep(1000);
	    ob7. report.click();		
		ob7.calenderreport.click();
		ob7.monthreport.click();
		Thread.sleep(1000);
		ob7.findbutton.click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver1;/////scroll down
		j.executeScript("window.scroll(0,1000)","");
		System.out.println("passed down"); 
		Thread.sleep(4000);
		Thread.sleep(1000);
		String expected= "https://qabible.in/erp/attendance/report";
		String actual=driver1.getCurrentUrl();
		Assert.assertEquals(actual, expected); 
		  
  }
  @Test(priority=6,enabled=true)
  public void testcase8() throws InterruptedException{
	    Payroll ob8=new Payroll(driver1);
	    Thread.sleep(2000);
	    ob8.payroll.click();	
	    String expected= "https://qabible.in/erp/payroll";
		String actual=driver1.getCurrentUrl();
		Assert.assertEquals(actual, expected); 
	    ob8.calenderpayroll.click();		
		ob8.monthpayroll.click();	
		ob8.findpayrollbutton.click();		
		ob8.viewpayroll.click();		
		ob8.updatebuttonviewpayroll.click();
		Thread.sleep(2000);		
		JavascriptExecutor j=(JavascriptExecutor)driver1;/////scroll down
		j.executeScript("window.scroll(0,1000)","");
		System.out.println("passed down"); 
		ob8.saveupdatebutton.click();
        Thread.sleep(3000);
		 driver1.navigate().to("https://qabible.in/erp/payroll");
  }
  
  @Test(priority=7,enabled=true)
  public void testcase9() throws InterruptedException{
	  Area ob9=new Area(driver1);
	    Thread.sleep(3000);
		ob9.area.click();
		ob9.eyearea.click();
		driver1.navigate().back();
		ob9.penarea.click();
		driver1.navigate().back();
		ob9.createareabutton.click();
		Thread.sleep(2000);
		ob9.namearea.sendKeys("Krishna");
		Thread.sleep(1000);
		ob9.descriptioncreatearea.click();
		ob9.descriptioncreatearea.sendKeys("Testing Engineer");
		ob9.savebuttonarea.click();
		String expected= "Create Area";
		String actual=driver1.getTitle();
		Assert.assertEquals(actual, expected);
		driver1.navigate().to("https://qabible.in/erp/area");
		
  }
  
 @Test(priority=8,enabled=true)
 public void testcase10() throws InterruptedException{
	 CreateJobPage ob10=new CreateJobPage(driver1);
	 Thread.sleep(3000);
	 ob10.Jobspage.click();
	 ob10.Jobs.click();
	 String expected= "https://qabible.in/erp/jobs";
	  String actual=driver1.getCurrentUrl();
	  Assert.assertEquals(actual, expected); 
	 ob10.CreateJobbutton.click();
	 Thread.sleep(1000);
	 ob10.jobTitle.sendKeys("Testing in Software");
	 ob10.client.click();
	 ob10.cl.click();
	 ob10.po.sendKeys("Sample");
	 ob10.description.sendKeys("Designing and Analysis");
	 ob10.jobType.click();
	 Thread.sleep(1000);
	 ob10.jobtype();
	 Thread.sleep(1000);
	//// ob10.saveButton.click();
	 driver1.navigate().to("https://qabible.in/erp/job/create");;
 }
 @Test(priority=10,enabled=true)
 public void testcase11() throws InterruptedException{
	 Logoutpage ob11=new Logoutpage(driver1);
	 Thread.sleep(3000);
	 ob11.profile.click();
	 ob11.logout.click();
	 
	 
 }
  @BeforeTest
	 public static WebDriver beforeTest() {
	UtilityCommon objutilitycommon=new UtilityCommon();
	 driver1= objutilitycommon.web("https://qabible.in/erp/","chrome");
		return driver1;
	 }
	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(2000);
	driver1.close();
	}

}
