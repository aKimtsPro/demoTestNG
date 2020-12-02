package bstorm.akimt.demoTestNG.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Object[] params = result.getParameters();

        System.out.println( result.getMethod().getMethodName() + " a été lancée");
        System.out.println("PARAMETERS : " + (params.length == 0 ? " AUCUN" : ""));

        for (Object o : params) {
            System.out.println(" - " + o);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getMethodName() + " SUCCEDED in " + (result.getEndMillis() - result.getStartMillis()) + "ms\n");
    }
}
