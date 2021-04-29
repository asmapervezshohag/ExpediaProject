package Com.PeopleNTech.Framework.FrameWorkForBetterLearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class UsefulMethods {
	public WebDriver driver;
	public JavascriptExecutor js;
	@Parameters({"browser","website"})
	
  @BeforeClass
  public void browsers(String browser,String sites) {
	  String path=System.getProperty("user.dir");
  		if (browser.equalsIgnoreCase("Chrome")) {
  			System.setProperty("webdriver.chrome.driver",
  					path +"\\drivers\\chromedriver.exe");
  			driver = new ChromeDriver();
  			driver.get(sites);
  			
  			driver.manage().window().maximize();
  		} else if (browser.equalsIgnoreCase("FireFox")) {
  			System.setProperty("webdriver.gecko.driver",
  					path+"\\drivers\\geckodriver.exe");
  			driver = new FirefoxDriver();
  			driver.get(sites);
  			driver.manage().window().maximize();
  		} else if (browser.equalsIgnoreCase("Edge")) {
  			System.setProperty("webdriver.edge.driver",
  					path +"\\drivers\\msedgedriver.exe");
  			driver = new EdgeDriver();

  			driver.get(sites);
  			driver.manage().window().maximize();
  		}
  }
  		@AfterClass
  		public void endclass() {
  			// driver.close();
  		}

  	
  }


