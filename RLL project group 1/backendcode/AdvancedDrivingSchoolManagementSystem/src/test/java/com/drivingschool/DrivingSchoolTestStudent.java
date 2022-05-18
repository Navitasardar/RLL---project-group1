package com.drivingschool;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DrivingSchoolTestStudent {

	WebDriver driver=null;
	
	@Test(groups = "DrivingSchool")
	public void launchDrivingSchool() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-phase5\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://localhost:4200/");
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"launchDrivingSchool"})
	public void clicklogin() {
		driver.findElement(By.linkText("Student Login")).click();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"clicklogin"})
	public void registerstudent() {
		driver.findElement(By.linkText("New User? Click here to register")).click();
		driver.findElement(By.id("sname")).sendKeys("newstudent");
		driver.findElement(By.id("sage")).sendKeys("50");
		driver.findElement(By.id("semail")).sendKeys("newstudent@email.com");
		driver.findElement(By.id("spassword")).sendKeys("newstudent1");
		driver.findElement(By.id("slocation")).sendKeys("local");
		
		try
        {
          System.out.println("Start of delay: "+ new Date());
          // Delay for 5 seconds
          Thread.sleep(5000);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
		
		driver.findElement(By.id("regstudent")).submit();
		
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"registerstudent"})
	public void login() {
		driver.findElement(By.linkText("Student Login")).click();
		driver.findElement(By.id("sname")).sendKeys("newstudent");
		driver.findElement(By.id("spassword")).sendKeys("newstudent1");
		
		try
        {
          System.out.println("Start of delay: "+ new Date());
          // Delay for 5 seconds
          Thread.sleep(5000);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
		
		driver.findElement(By.id("slogin")).submit();
		driver.findElement(By.id("slogin")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"login"})
	public void choosepackage() {
		driver.findElement(By.linkText("Choose Package")).click();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"choosepackage"})
	public void choosepackagelocation() {
		
		driver.findElement(By.id("packlocation")).click();
		driver.findElement(By.id("localpack")).click();
		driver.findElement(By.id("book")).click();
		
		try
        {
          System.out.println("Start of delay: "+ new Date());
          // Delay for 5 seconds
          Thread.sleep(5000);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
		
		driver.findElement(By.linkText("Click here to go back to dashboard")).click();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"choosepackagelocation"})
	public void changepwd() {
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.id("sname")).sendKeys("newstudent");
		driver.findElement(By.id("spassword")).sendKeys("newstudent1");
		
		try
        {
          System.out.println("Start of delay: "+ new Date());
          // Delay for 5 seconds
          Thread.sleep(5000);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
		
		driver.findElement(By.id("changepwd")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"changepwd"})
	public void loginagain() {
		driver.findElement(By.linkText("Student Login")).click();
		driver.findElement(By.id("sname")).sendKeys("Navya Sardar");
		driver.findElement(By.id("spassword")).sendKeys("sardar123");
		
		try
        {
          System.out.println("Start of delay: "+ new Date());
          // Delay for 5 seconds
          Thread.sleep(5000);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
		
		driver.findElement(By.id("slogin")).submit();
		driver.findElement(By.id("slogin")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"loginagain"})
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
}
