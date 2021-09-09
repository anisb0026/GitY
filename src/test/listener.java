package test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener { //Itestlistener: is an interface which have all the methods for TestNG listeners.

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("i Succesuffuly excuted");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// Exemple screenshort Code 
	  System.out.println("i fail excuted"+" "+result.getName()); //result.getName(): to get name of methods which fail
    } 

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
}
