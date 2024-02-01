package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
// Browser Launch
	public WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			else if (browserName.equalsIgnoreCase("firefox")) {
				//System.setProperty("webdriver.gecko.driver");
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--remote-allow-origins=*");
				driver =new FirefoxDriver();
			}
			else if (browserName.equalsIgnoreCase("ie")) {
				//System.setProperty("webdriver.ie.driver");
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--remote-allow-origins=*");
				driver = new InternetExplorerDriver();
			}
			else {
				System.out.println("browser id is invalid");
			}
		return driver;
	}
	
	//get method
	public WebDriver get(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
return driver;
	}

}
