package bstorm.akimt.demoTestNG.correction.prog;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CorrectionTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" * Test START : " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" V Test SUCCESS : " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" X Test FAILURE : " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(" - Test SKIPPED : " + result.getMethod().getMethodName());
        for (ITestNGMethod iTestNGMethod : result.getSkipCausedBy()) {
            System.out.println("\t"+iTestNGMethod.getMethodName());
        }
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("-----------------------------");
        System.out.println("         TEST START");
        System.out.println("-----------------------------");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("-----------------------------");
        System.out.println("         TEST END");
        System.out.println("-----------------------------");
    }
}
