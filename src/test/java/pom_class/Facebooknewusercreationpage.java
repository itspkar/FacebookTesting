package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class Facebooknewusercreationpage extends BasePage  {
	public WebDriver driver;

	// Declaration

	@FindBy(name = "firstname")
	private WebElement Firstname;
	
	@FindBy(name = "lastname")
	private WebElement Lastname;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement entermobilenumber;
	
	@FindBy(id = "password_step_input")
	private WebElement passwordfield;
	
	@FindBy(name = "birthday_day")
	private WebElement selectday;
	
	@FindBy(name = "birthday_month")
	private WebElement selectmonth;
	
	@FindBy(name = "birthday_year")
	private WebElement selectyear;
	
	@FindBy(xpath = "(//input[@name='sex'])[2]")
	private WebElement genderselect;
	
	@FindBy(xpath = "//img[@class='_8idr img']")
	private WebElement closeLink;

	// initialisation
	
	public Facebooknewusercreationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// utilisation
	
	public void enterusername(String Fname)
	{
		visibilityofelementlocated(driver, Firstname);
		Firstname.sendKeys(Fname);
		visibilityofelementlocated(driver, Firstname);
	}
	
	public void enterlastname(String Lname)
	{
		Lastname.sendKeys(Lname);
	}
	public void entermobilenumber(String mobno)
	{
		entermobilenumber.sendKeys(mobno);
	}
	
	public void enterpassword(String password)
	{
		passwordfield.sendKeys(password);
		visibilityofelementlocated(driver, passwordfield);
	}
	
	public void selectdaymethod()
	{
		selectbyvisibletext(selectday, "11");
	}
	public void selectmonthmethod()
	{
		selectbyvisibletext(selectmonth, "May");
	}
	public void selectyearmethod()
	{
		selectbyvisibletext(selectyear, "2018");
		//visibilityofelementlocated(driver, Firstname);
	}
	public void selectgender()
	{
		visibilityofelementlocated(driver, Firstname);
		javascriptclick(driver,genderselect);
		visibilityofelementlocated(driver, Firstname);
		
	}
	public void closebox()
	{
		javascriptclick(driver, closeLink);
	}


}
