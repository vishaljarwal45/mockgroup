package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.Listener;
import POM.HomePage;
import base.Base;
import net.jodah.failsafe.internal.util.Assert;
import utility.Utility;

@Listeners(Listener.class)
public class TestClass extends Base {
	
 
	HomePage home;
	
  @BeforeClass
  public void launchBrowser() throws IOException {
	  
	  initializebrowser();
	  home=new HomePage(driver);
	  
	  
  }
  @Test
  public void openTermLife() throws InterruptedException {
	  
	  home.OpenTermLife();
	  Utility.ImplicitlyWait(driver);
	   }
  @Test
  public void sendNam() throws IOException {
	  home.addName(Utility.GetDataFromPropertiesfiles("NAME"));
  }
  @Test
  public void sendBOD() throws IOException {
	  home.AddDOB(Utility.GetDataFromPropertiesfiles("DOB"));
  }
  @Test
  public void sendMOB() throws IOException {
	  home.addMobilNum(Utility.GetDataFromPropertiesfiles("MOB"));
  }
  @Test
  public void submitbutton() {
	  home.submitButtonClick();
	  
	  
  }
  
  
  
}
