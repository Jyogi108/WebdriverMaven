package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;



public class LoginTest {
	public static WebDriver driver;
	
	
	@Before
	public void setup(){
	/*	driver  = new ChromeDriver();
		//driver = new PhantomJSDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		*/System.out.println("********************Testing on Chrome -Gmail Login Test***********************");

	System.out.println("********************Test 1***********************");
	}
@Test
	public void loginDo() throws InterruptedException{
	/*	driver.get("http://www.gmail.com");
	//	Thread.sleep(13000);

		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("yogi.automation108");//sendKeys();
		//Thread.sleep(13000);

		driver.findElement(By.xpath("//div[@id ='identifierNext'][@role='button']")).click();
	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id ='password']/div/div/div/input")).sendKeys("Automation123$");
	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id ='password']/div/div/div/input")).sendKeys(Keys.ENTER);
		//Thread.sleep(13000);
		System.out.println("*********************************************************************");
		System.out.println(" ::: Title is :::::::::->  "+driver.getTitle());
		System.out.println(" ::: WindowHandle is ::->  "+driver.getWindowHandle());
		System.out.println(" ::: CurrentUrl is ::::->  "+driver.getCurrentUrl());
		
		System.out.println(" Email content:   "+driver.findElement(By.xpath("//a[contains(@title, 'Inbox')]")).getAttribute("aria-label"));
		
		System.out.println("*********************************************************************");
//Thread.sleep(13000);
*/
System.out.println("********************Test2 ***********************");	
	}
@After
	public void quit(){
	//driver.quit();
	System.out.println("*******RADHEY RADHEY**********");
	System.out.println("********************Testi3***********************");
	}

}
