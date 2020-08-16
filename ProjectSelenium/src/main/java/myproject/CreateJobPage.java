package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateJobPage {
	WebDriver driver ;
	
	
	@FindBy(xpath="//*[@title='Jobs']")	
	public WebElement Jobspage  ;	
	@FindBy(xpath="//*[@href='/erp/jobs']")	
	public WebElement Jobs;	
	@FindBy(xpath="//*[@href='/erp/job/create']")	
	public WebElement CreateJobbutton ;
	@FindBy(xpath="//*[@id=\"job-title\"]")	
	public WebElement jobTitle ;
	@FindBy(xpath="//span[@id='select2-job-client_id-container']")	
	public WebElement client ;	
	@FindBy(xpath="//li[@class='select2-results__option']")	
	public WebElement cl ;	
	@FindBy(xpath="//input[@id='job-po']")	
	public WebElement po ;
	@FindBy(xpath="//textarea[@id='job-description']")	
	public WebElement description ;
	@FindBy(xpath="//select[@id='job-type']")	
	public WebElement  jobType ;
	// Select type=new Select(jobType);
	// type.selectByIndex(1);
	
	@FindBy(xpath="//button[@class='btn btn-success']")	
	public WebElement  saveButton;
	
	public void jobtype() {
		Select type=new Select(jobType);
		type.selectByIndex(1);
	}
	
	
	
	public CreateJobPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}




	
}
