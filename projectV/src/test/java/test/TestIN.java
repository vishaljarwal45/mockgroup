package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.Listener;
import POM.travelinsurance;
import base.Base;

@Listeners(Listener.class)


public class TestIN extends Base{
	travelinsurance travel;
	
	
  @BeforeClass
  public void intilazeBrowser() throws IOException {
	  initializebrowser();
	  travel=new travelinsurance(driver);
	  }
  @Test(priority = 1)
  public void opentravelinsurance() throws InterruptedException {
	  
	  travel.travelInsurance();
	  Thread.sleep(1000);
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
  }
  @Test(priority = 2)
  public void selectlocation() {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	 travel.location();
	 travel.nextbutton();
	  
  }
  @Test(priority = 3)
  public void StartDate() {
	  travel.startdate();
  }
 @Test(priority = 4)
 public void EndDate() {
	 travel.enddate();
	 travel.nextbutton();
	 
 }
 @Test(priority = 5)
 public void selectPerson() {
	travel.people();	 
	 
 }
  @Test(priority = 6)
  public void selectAge() {
	  travel.age(driver);
	  travel.nextbutton();
  }
  @Test(priority = 7)
  public void PreInsurance() {
	  travel.preinsurance();
	  travel.nextbutton();
	  
  }
  @Test(priority = 8)
  public void AddmobNum() {
	  travel.addmobnum();
	  
  }
  @Test(priority = 9)
  public void ViewPlan() {
	  travel.viewplan();
	  
  }
  
  
  
}
