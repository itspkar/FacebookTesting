package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import generics.AutoConstant;
import generics.ExcelLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_class.Facebooknewusercreationpage;
import pom_class.Facebooknewuserloginpage;

public class StepDefination extends ExcelLibrary implements AutoConstant {

	public WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("User clicks on createNewAccount option")
	public void user_clicks_on_create_new_account_option() {

		Facebooknewuserloginpage newuser = new Facebooknewuserloginpage(driver);
		newuser.registerbutton();
	}

	@Then("User reach the NewRegistration Page and enters the data")
	public void user_reach_the_new_registration_page_and_enters_the_data() throws IOException {

		Facebooknewusercreationpage createuser = new Facebooknewusercreationpage(driver);

		createuser.enterusername(getcellvalue(Sheetname, 1, 0));
		createuser.enterlastname(getcellvalue(Sheetname, 1, 1));
		createuser.entermobilenumber(getcellvalue(Sheetname, 1, 2));
		createuser.enterpassword(getcellvalue(Sheetname, 1, 3));
		createuser.selectdaymethod();
		createuser.selectmonthmethod();
		createuser.selectyearmethod();
		createuser.selectgender();
	}

	@Then("user closes the dialogue box")
	public void user_closes_the_dialogue_box() {

		Facebooknewusercreationpage createuser1 = new Facebooknewusercreationpage(driver);
		createuser1.closebox();
		driver.quit();

	}

}
