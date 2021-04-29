package Com.PeopleNTech.Framework.FrameWorkForBetterLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicareSolutionHomePage {
	WebDriver driver;
	@FindBy(xpath="//input[@name='txtZip']")
	WebElement zipcode;
	@FindBy(xpath="//input[@name='btn1']")
	WebElement StartButton;
	
	public  MedicareSolutionHomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public void zipCodeEnter(String zipcod) {
	zipcode.sendKeys(zipcod);
}
public void StartButtonClick() {
	StartButton.click();
}
}