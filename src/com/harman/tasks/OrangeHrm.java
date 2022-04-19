package com.harman.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\OneDrive\\Desktop\\Harman\\Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.linkText("Memberships")).click();
		driver.findElement(By.id("btnAddMembershipDetail")).click();
		
		Select selectMembership=new Select(driver.findElement(By.id("membership_membership")));
		selectMembership.selectByValue("1");
		
		Select selectPaidBy=new Select(driver.findElement(By.name("membership[subscriptionPaidBy]")));
		selectPaidBy.selectByVisibleText("Company");
		
		driver.findElement(By.id("membership_subscriptionAmount")).sendKeys("1200");

		Select selectCurrency=new Select(driver.findElement(By.name("membership[currency]")));
		selectCurrency.selectByValue("MYR");
		
		driver.findElement(By.id("membership_subscriptionCommenceDate ")).sendKeys("2022-03-31");
		driver.findElement(By.id("membership_subscriptionRenewalDate ")).sendKeys("2022-04-20");
		driver.findElement(By.id("btnSaveMembership")).click();
		
		
		
	}

}
