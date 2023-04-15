package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class Facebooknewuserloginpage extends BasePage implements AutoConstant {
	// declarations
		public WebDriver driver;
		
	@FindBy(xpath = "//a[contains(text(),'Create new account')]")
	private WebElement registerbutton;

	// initialisation
	
	public Facebooknewuserloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// utilisation

	public void registerbutton()
	{
		//driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		javascriptclick(driver, registerbutton);
		visibilityofelementlocated(driver, registerbutton);
	}
	
}
