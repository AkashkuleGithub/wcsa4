package takeScreenShotDynamic;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class CustomListner extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("the name of "+methodName+"is failed");
		failed(methodName);
		
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
	public void initialization() {
		// TODO Auto-generated method stub
		super.initialization();
	}

	@Override
	public void failed(String methodName) {
		// TODO Auto-generated method stub
		super.failed(methodName);
	}
}
	

