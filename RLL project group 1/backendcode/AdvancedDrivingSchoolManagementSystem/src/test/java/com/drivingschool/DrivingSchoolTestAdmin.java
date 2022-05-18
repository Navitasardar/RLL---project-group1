package com.drivingschool;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DrivingSchoolTestAdmin {

	WebDriver driver=null;
	
	@Test(groups = "DrivingSchool")
	public void launchDrivingSchool() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-phase5\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://localhost:4200/");
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"launchDrivingSchool"})
	public void clicklogin() {
		driver.findElement(By.linkText("Admin Login")).click();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"clicklogin"})
	public void login() {
		driver.findElement(By.id("aname")).sendKeys("Navita Sardar");
		driver.findElement(By.id("apassword")).sendKeys("navita1234");
		
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
		
		driver.findElement(By.id("lbutton")).submit();
		driver.findElement(By.id("lbutton")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"login"})
	public void clickadminlist() {
		driver.findElement(By.linkText("Admin List")).click();
		
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
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"clickadminlist"})
	public void clickstudentlist() {
		driver.findElement(By.linkText("Student List")).click();
		
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
		
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"clickstudentlist"})
	public void addstudent() {
		driver.findElement(By.id("addstud")).click();
		driver.findElement(By.id("sname")).sendKeys("Navya Sardar");
		driver.findElement(By.id("sage")).sendKeys("22");
		driver.findElement(By.id("semail")).sendKeys("navya@email.com");
		driver.findElement(By.id("spassword")).sendKeys("sardar123");
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
		
		driver.findElement(By.id("addstudent")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"addstudent"})
	public void editstudent() {
		
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
		
		driver.findElement(By.id("editstud")).click();
		driver.findElement(By.id("sid")).sendKeys("1");
		driver.findElement(By.id("sname")).sendKeys("Navya Sardar");
		driver.findElement(By.id("sage")).sendKeys("22");
		driver.findElement(By.id("semail")).sendKeys("navya@gmail.com");
		driver.findElement(By.id("spassword")).sendKeys("sardar123");
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
		
		driver.findElement(By.id("editstudent")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"editstudent"})
	public void removestudent() {
		
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
		
		driver.findElement(By.id("remstud")).click();
		driver.findElement(By.id("sid")).sendKeys("6");
		
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
		
		driver.findElement(By.id("removestudent")).submit();
		
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
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"removestudent"})
	public void clickpackagelist() {
		driver.findElement(By.linkText("Package Details")).click();
		
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
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"clickpackagelist"})
	public void addpackage() {
		driver.findElement(By.id("addpackage")).click();
		driver.findElement(By.id("pname")).sendKeys("package1");
		driver.findElement(By.id("pstartingdate")).sendKeys("08/05/0022");
		driver.findElement(By.id("pstudentattendance")).sendKeys("present");
		driver.findElement(By.id("pvehicle")).sendKeys("skoda");
		driver.findElement(By.id("ptrainername")).sendKeys("amit");
		driver.findElement(By.id("ptrainerlocation")).sendKeys("local");
		driver.findElement(By.id("ptrainerexp")).sendKeys("10");
		
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
		
		driver.findElement(By.id("addpack")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"addpackage"})
	public void editpackage() {
		
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
		
		driver.findElement(By.id("addpackage")).click();
		driver.findElement(By.id("pname")).sendKeys("package1");
		driver.findElement(By.id("pstartingdate")).sendKeys("08/05/0022");
		driver.findElement(By.id("pstudentattendance")).sendKeys("present");
		driver.findElement(By.id("pvehicle")).sendKeys("skoda");
		driver.findElement(By.id("ptrainername")).sendKeys("amit");
		driver.findElement(By.id("ptrainerlocation")).sendKeys("local");
		driver.findElement(By.id("ptrainerexp")).sendKeys("8");
		
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
		
		driver.findElement(By.id("editpack")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"editpackage"})
	public void removepackage() {
		
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
		
		driver.findElement(By.id("rempackage")).click();
		driver.findElement(By.id("pid")).sendKeys("4");
		
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
		
		driver.findElement(By.id("removepack")).submit();
		
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
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"removepackage"})
	public void changepwd() {
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.id("aname")).sendKeys("Navita Sardar");
		driver.findElement(By.id("apassword")).sendKeys("navita1234");
		
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
		driver.findElement(By.linkText("Admin Login")).click();
		driver.findElement(By.id("aname")).sendKeys("Navita Sardar");
		driver.findElement(By.id("apassword")).sendKeys("navita1234");
		
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
		
		driver.findElement(By.id("lbutton")).submit();
		driver.findElement(By.id("lbutton")).submit();
	}
	
	@Test(groups = "DrivingSchool", dependsOnMethods = {"loginagain"})
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	
}
