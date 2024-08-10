package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Ex_1 {
	
	public static void main(String[] args) {
		ExtentReports ep = new ExtentReports();
		ExtentSparkReporter esp = new ExtentSparkReporter("C:\\Users\\khaja.mohinuddin\\eclipse-workspace\\SeleniumJavaLearning\\src\\test\\Reports\\report.html");
		ep.attachReporter(esp);
		ExtentTest test1 =  ep.createTest("Test 1");
		test1.pass("This is passes");
		
		ep.flush();
		
		System.out.println("Passed");
		
		
		
	}

}
