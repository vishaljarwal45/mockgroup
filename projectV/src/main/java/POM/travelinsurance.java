package POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travelinsurance {

	
	@FindBy(xpath = "/html/body/main/div[2]/section/div[7]/a/div[1]/div/i") private  WebElement travelIN;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[3]/div[2]/div/div[1]/div[2]/p[1]") private WebElement locat;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[3]/div[2]/div/div[2]/button")private WebElement next1;
	
	@FindBy(xpath = "//input[@value='26 August, 2022']") private WebElement startdate;
	
	@FindBy(xpath = "//input[@value='27 August, 2022']") private WebElement EndDate;
	
	@FindBy(xpath = "//label[text()='1']")private WebElement person;
	
	@FindBy(xpath = "//select[@id='feet']")private WebElement age;
	
	@FindBy(id = "ped_no") private WebElement preInsu;
	
	@FindBy(id = "mobileNumber")private WebElement mobileNO;
	
	@FindBy(xpath = "//button[text()='View plans']") private WebElement viewplan;
	
	
	
	public travelinsurance(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void travelInsurance() {
		travelIN.click();
		

	}
	
	
	public void location()  {
		
		locat.click();
		
		locat.sendKeys(Keys.RETURN);
	}
	
	public void nextbutton() {
		next1.click();
	}
	
	public void startdate() {
		
		startdate.click();
	}
	
	public void enddate() {
		EndDate.click();
	}
	
	public void people() {
		person.click();
	}
	
	public void age(WebDriver driver) {
		
		
		Actions act=new Actions(driver);
		  act.moveToElement(age).perform();
		  act.sendKeys(Keys.DOWN).perform();
	}
	
	public void preinsurance() {
		preInsu.click();
	}
	
	public void addmobnum() {
	mobileNO.sendKeys("8485667377");
		
	}
	
	public void viewplan() {
		viewplan.click();
	}
	
}
