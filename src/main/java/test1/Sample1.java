package test1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
<<<<<<< HEAD
    //comments added
=======
	//comment added

>>>>>>> 9211abf21343f953eb8126824a834eb32237c836
	public WebDriver  driver; 

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}

	@Test	
	public void firstProgram() throws InterruptedException
	{

		driver.get("https://google.com");
		String Title = 	driver.getTitle();
		System.out.println( Title);
		driver.manage().window().maximize();
	    Thread.sleep(5); 
	    
	}
	@AfterTest(enabled= false)
	public void closebrowser() {
		driver.quit();
		System.out.println("The driver has been closed.");
	}





}
