package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class utilityIN {

	
	public static String getdatafromproperties(String key) throws IOException {
		
		Properties obj=new Properties();
	
	FileInputStream myfile=new FileInputStream("C:\\Users\\icon\\eclipse-workspace\\projectV\\mavenProperty.properties");
		
		obj.load(myfile);
		String value = obj.getProperty(key);
		return value;
		
	}
	
	public static void waitMethod(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
	
	
	
}
