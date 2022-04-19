package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBlogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\OneDrive\\Desktop\\Harman\\Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jayarawat.2903@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("jaya@123");
	    driver.findElement(By.name("login")).click();
	}

}
