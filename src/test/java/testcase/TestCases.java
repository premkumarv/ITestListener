package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.listenerDemo.class)
public class TestCases {			
	
	public static WebDriver driver;
	@Test		
	public void Login()				
	{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREAM\\workspace\\ItestListeners\\src\\test\\resources\\excutables\\chromedriver.exe");

	 driver= new ChromeDriver();					

//Test to pass as to verify listeners.		
		
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
    driver.findElement(By.name("password")).sendKeys("amUpenu");							
    driver.findElement(By.name("btnLogin")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}			