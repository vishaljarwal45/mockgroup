package Listener;


import java.io.IOException; 

import org.testng.ITestListener; 
import org.testng.ITestResult;
import org.testng.Reporter;


import base.Base;

public class Listener extends Base implements ITestListener{

		
		public void onStart(ITestResult result) {
			Reporter.log("when TC started "+result.getName(),true);
			}
		
		
		public void onTestStart(ITestResult result) {
			
			Reporter.log(" test case started "+result.getName(),true);
		}
		
		
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Test case has been skipped"+result.getName(),true);
		}
		
		public void onTestSuccess(ITestResult result) {
			Reporter.log("test cases successfully passed "+result.getName(),true);
		}
		
		
		public void  onFinish(ITestResult result) {
			Reporter.log(" test case finish"+result.getName(),true);
		}
		
		public void onTestFailure(ITestResult result) {
			Reporter.log(" test case failure"+result.getName(),true);
			try {
				screenshotmethod(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
//		
//		public void onTestSuccess(ITestResult result) {
//			
//			Reporter.log("this method has succesfullystarted"+result.getName(),true);
//		}
		
}
