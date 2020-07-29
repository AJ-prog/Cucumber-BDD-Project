package steps;

import java.sql.SQLException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import page.NewAccountPage;
import page.SideNavigation;
import utill.BrowserFactory;
import utill.Database;

public class NewAccountSteps extends Stepbase {
	// creating global varibale
	WebDriver driver;
	LoginPage loginpage;
	SideNavigation sideNavigation;
	NewAccountPage newAccountPage;

	@Before
	public void stratfirst() { // this method will automatic gets called
		driver = BrowserFactory.init(); // passing the driver
		loginpage = PageFactory.initElements(driver, LoginPage.class); // access the login page
		sideNavigation = PageFactory.initElements(driver, SideNavigation.class);// access sidenavigat page
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);// access newaccountpage
	}

	@Given("^a user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_with_username_and_password(String userName, String passwrod) throws InterruptedException { // passwordThread.sleep(2000);
		loginpage.login(userName, passwrod);
	}

	@When("^user navigates to New Account Page$")
	public void user_navigates_to_New_Account_Page() throws InterruptedException {
		sideNavigation.goToNewAccountPage();
	}

	@Given("^a user with username$")

	public void a_user_with_username() throws ClassNotFoundException, SQLException, InterruptedException {
		Thread.sleep(2000);
		loginpage.login(Database.get("username"), Database.get("password"));
		Thread.sleep(3000);
	}

	@Then("^new account page should display$") // this mapping feature page to step class
	public void new_account_page_should_display() throws Exception {
		screenShot(driver, "C://ScreenShots//صور1.jpg");
		Assert.assertTrue("Page did not display", newAccountPage.isPanelHeaderDisplayed());
		// this will interacting with page class
	}

	@When("^user create new account using title \"([^\"]*)\" Description \"([^\"]*)\" Amount \"([^\"]*)\"$")
	public void user_create_new_account_using_title_Description_Amount(String title, String description, String amount)
			throws InterruptedException {
		Thread.sleep(2000);
		newAccountPage.inputNewAccount(title + (new Random().nextInt(999)));
		newAccountPage.inputDescription(description);
		newAccountPage.inputAmount(amount);
		newAccountPage.clickOnSubmitButton();
		Thread.sleep(5000);
	}

	@After
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
