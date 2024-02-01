package org.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Minimumprice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.fnp.com/cakes-lp?promo=cakesmenu_tab_dt_hm");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root jss24']"));
		cancel.click();
		Thread.sleep(3000);
		WebElement cakes = driver.findElement(By.xpath("//a[@id='#cakesmenu']"));
		cakes.click();
		WebElement birthdayCake = driver.findElement(By.xpath("//a[text()='Birthday Cakes']"));
		List<WebElement> priceElement = driver.findElements(By.xpath("(//span[@class='product-card_product-price-info__17tj7'])[1]"));
		List<Double> prices = new ArrayList<>();
		for (WebElement price : priceElement) {
			String priceText= price.getText().replace("[^\\d.]", "");
			if (!priceText.isEmpty()) {
				double storedPrice= Double.parseDouble(priceText);
				prices.add(storedPrice);
			}
		}
		double minValue = Double.MAX_VALUE;
		for (double double1 : prices) {
			if (double1<minValue) {
				minValue=double1;
				
			}
			System.out.println(minValue);
			driver.quit();
		}
		
	}
}
