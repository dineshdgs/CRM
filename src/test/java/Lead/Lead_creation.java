package Lead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base_class.Base;

public class Lead_creation extends Base{

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		driver.get("https://crmdigitalmarketing.com/login");
		driver.manage().window().maximize();
		// Login page
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("saravanaprasad@theinfinityhub.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Sksking96@");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		// Add new Lead
		WebElement leadDetail = driver.findElement(By.xpath("(//a[@class='btn rounded-0 fs-3 border-0'])[1]"));
		leadDetail.click();
		Thread.sleep(3000);
		WebElement newLead = driver.findElement(By.xpath("(//span[@data-bs-toggle='modal'])[2]"));
		newLead.click();
		Thread.sleep(3000);    
		// data inserting in new lead
        WebElement firstName = driver.findElement(By.xpath("(//input[@name='first_name'])[1]"));
        firstName.sendKeys("Dinesh");
        WebElement lastName = driver.findElement(By.xpath("(//input[@name='last_name'])[1]"));
        lastName.sendKeys("K");
        WebElement mailId = driver.findElement(By.xpath("(//input[@name='person_emailid'])[1]"));
        mailId.sendKeys("dinesh.krishnan@roundrockabaschool.onmicrosoft.com");
        WebElement mobileNum = driver.findElement(By.xpath("(//input[@name='person_mobile'])[1]"));
        mobileNum.sendKeys("6379732890");
        WebElement companyNum = driver.findElement(By.xpath("(//input[@name='cmp_mobile'])[1]"));
        companyNum.sendKeys("6379732890");
        WebElement next1 = driver.findElement(By.xpath("//button[@id='btn_submit_one']"));
        next1.click();
        Thread.sleep(3000);
        //company details
        WebElement companyName = driver.findElement(By.xpath("//input[@id='company_name']"));
        companyName.sendKeys("Infinityhub");
        WebElement companyEmail = driver.findElement(By.xpath("//input[@id='company_email']"));
        companyEmail.sendKeys("dinesh.krishnan@roundrockabaschool.onmicrosoft.com");
        WebElement next2 = driver.findElement(By.xpath("//button[@id='btn_submit_two']"));
        next2.click();
        
	}

}
