package com.harman.multipletabs;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\OneDrive\\Desktop\\Harman\\Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.medibuddy.in/");
		
		//click on Not Now 
		driver.findElement(By.id("wzrk-cancel")).click();

		//click on for employer 
		driver.findElement(By.linkText("For Employer")).click();

		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("getInTouchName")).sendKeys("admin");
		driver.findElement(By.name("getInTouchEmail")).sendKeys("admin123@gmail.com");
		
		//enter phone number as 12345
		driver.findElement(By.name("getInTouchMobile")).sendKeys("1234567890");
		driver.findElement(By.name("getInTouchDesignation")).sendKeys("nothing");
		driver.findElement(By.id("getInTouchEmpCount")).sendKeys("1");
		
		//click on GetInTouch
		//tagname[@attribute='']
		//tagname[text()='']

		//		Contains
		//tagname[contains(@att,'')]
		//tagname[contains(text(),'')]
		driver.findElement(By.xpath("//button[text(),'Get in Touch')]")).click();
	}

}
