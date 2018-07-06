package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class LoginTest {
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setup(){
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("********************Testing on Chrome -Gmail Login Test***********************");

	
	}
	@Test
	public void loginDo() throws InterruptedException{
		driver.get("http://www.gmail.com");
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("yogi.automation108");
		driver.findElement(By.xpath("//div[@id ='identifierNext'][@role='button']")).click();
	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id ='password']/div/div/div/input")).sendKeys("Automation123$");
	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id ='password']/div/div/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(13000);
		System.out.println("*********************************************************************");
		System.out.println(" ::: Title is :::::::::->  "+driver.getTitle());
		System.out.println(" ::: WindowHandle is ::->  "+driver.getWindowHandle());
		System.out.println(" ::: CurrentUrl is ::::->  "+driver.getCurrentUrl());
		
		System.out.println(" Email content:   "+driver.findElement(By.xpath("//a[contains(@title, 'Inbox')]")).getAttribute("aria-label"));
		
		System.out.println("*********************************************************************");
Thread.sleep(13000);
	
	}
	@AfterSuite
	public void quit(){
	driver.quit();
	}

}
