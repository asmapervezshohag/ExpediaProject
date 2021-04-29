package Com.PeopleNTech.Framework.FrameWorkForBetterLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsInformation {
	WebDriver driver;
	// Start Date for Coverage:
	@FindBy(xpath = "//input[@name='effMM']")
	WebElement StartMonth;
	@FindBy(xpath = "//input[@name='effDD']")
	WebElement StartDay;
	@FindBy(xpath = "//input[@name='effYYYY']")
	WebElement StartYear;

	// currently enrolled or not?
	@FindBy(css = "#txtPartAn")
	WebElement CurrentlyEnrrolledOrNot;

	// Date of Birth:
	@FindBy(xpath = "//*[@name='txtMM']")
	WebElement DBMonth;
	@FindBy(xpath = "//*[@name='txtDD']")
	WebElement DBDate;
	@FindBy(xpath = "//input[@id='txtYYYY']")
	WebElement DBYear;
	// for Eligibility checking window
	@FindBy(css = "#rdMS")
	WebElement ElegibilityYesButton;
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement ConinueButtonClick;
	// Name
	@FindBy(css = "#txtFirstName")
	WebElement FirstNameField;
	@FindBy(css = "#txtLastName")
	WebElement LastNameField;
	// Address
	@FindBy(css = "#txtAddress1")
	WebElement EnterAddress;
	@FindBy(css = "#txtCity")
	WebElement EnterCity;
	@FindBy(css = "#ddCounty")
	WebElement EnterCounty;
	@FindBy(css = "#txtState")
	WebElement EnterState;
	// Phone Number and Email

	@FindBy(xpath = "//input[@name='txtPhone1']")
	WebElement EnterPhoneNumber1;
	@FindBy(xpath = "//input[@name='txtPhone2']")
	WebElement EnterPhoneNumber2;
	@FindBy(xpath = "//input[@name='txtPhone3']")
	WebElement EnterPhoneNumber3;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement EmailFieldEnter;
	
	// Submit button
	@FindBy(css = "#btnSubmit")
	WebElement SeePlansButton;

	public ClientsInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void StartDateforTheCoverage(String month, String date, String year) throws InterruptedException {
		StartMonth.sendKeys(month);
		Thread.sleep(2000);
		StartDay.sendKeys(date);
		Thread.sleep(2000);
		DBYear.sendKeys(year);

	}

	public void DateofBirth(String dbm, String dbd, String dby) throws InterruptedException {
		DBMonth.sendKeys(dbm);
		Thread.sleep(2000);
		DBDate.sendKeys(dbd);
		Thread.sleep(2000);
		DBYear.sendKeys(dby);
	}

	public void CurrentInsuranceStatus() {
		CurrentlyEnrrolledOrNot.click();
	}

	public void EligibilityCheckingWindow() {
		ElegibilityYesButton.click();
	}

	public void FirstName(String firstname) {
		FirstNameField.sendKeys(firstname);
	}

	public void LastName(String lastname) {
		LastNameField.sendKeys(lastname);
	}

	public void EnterAddress(String address) {
		EnterAddress.sendKeys(address);
	}

	public void Phone(String phonenumber1, String phonenumber2, String phonenumber3) throws InterruptedException {
		EnterPhoneNumber1.sendKeys(phonenumber1);
		EnterPhoneNumber2.sendKeys(phonenumber2);
		EnterPhoneNumber3.sendKeys(phonenumber3);
		Thread.sleep(2000);
	}

	public void Email(String email) {
		EmailFieldEnter.sendKeys(email);
	}

	public void PlanFinderButton() {
		SeePlansButton.click();
	}

}
