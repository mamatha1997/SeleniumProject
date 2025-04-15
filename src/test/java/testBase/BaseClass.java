package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties p;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(String browser) throws Throwable {
		
		FileInputStream fi = new FileInputStream("./src//test//resources//config.properties");
		p = new Properties();
		p.load(fi);
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		case "edge":
			driver = new EdgeDriver();
			break;

		default:System.out.println("Invalid browser name....");
		return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.google.com");

			driver.get(p.getProperty("appURL"));

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public String generateNewEmail() {
		Date date = new Date();
		String emailwithTimestamp = date.toString().replace(" ", "").replace(":", "") + "@gmail.com";
		return emailwithTimestamp;
	}
}
