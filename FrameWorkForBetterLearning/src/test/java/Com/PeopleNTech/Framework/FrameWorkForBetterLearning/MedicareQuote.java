package Com.PeopleNTech.Framework.FrameWorkForBetterLearning;

import org.testng.annotations.Test;

public class MedicareQuote extends UsefulMethods {
	@Test
	public void f() throws InterruptedException {
		MedicareSolutionHomePage msHome = new MedicareSolutionHomePage(driver);

		ClientsInformation clientsInfo = new ClientsInformation(driver);
		Thread.sleep(2000);
		msHome.zipCodeEnter("10001");
		msHome.StartButtonClick();
		Thread.sleep(3000);
		clientsInfo.StartDateforTheCoverage("5", "01", "2021");
		clientsInfo.CurrentInsuranceStatus();
		Thread.sleep(2000);
		clientsInfo.DateofBirth("12","30","1985");
		//Thread.sleep(2000);
		//clientsInfo.EligibilityCheckingWindow();

		Thread.sleep(2000);
		clientsInfo.FirstName("John");
		Thread.sleep(2000);
		clientsInfo.LastName("Abraham");
		Thread.sleep(2000);
		clientsInfo.EnterAddress("31st Ave woodside");

		Thread.sleep(2000);
		clientsInfo.Phone("917", "666", "8000");
		Thread.sleep(1000);
		clientsInfo.Email("john@gmail.com");
		Thread.sleep(2000);
		clientsInfo.PlanFinderButton();
	}
}
