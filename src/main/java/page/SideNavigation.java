package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public SideNavigation(WebDriver driver) {
		this.driver = driver;
	}
	// Element Library
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankCashModule;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccountPage;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[2]/a")
//	WebElement ListAccountPage;
//	
	
	public void goToNewAccountPage() throws InterruptedException {
		Thread.sleep(2000);
		BankCashModule.click();
		NewAccountPage.click();
	}
	
//	public void goToListAccountPage() throws InterruptedException {
//		ListAccountPage.click();
//	}	
	
}
