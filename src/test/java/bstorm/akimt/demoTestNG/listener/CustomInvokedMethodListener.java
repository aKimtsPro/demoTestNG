package bstorm.akimt.demoTestNG.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class CustomInvokedMethodListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        int index = 1 + context.getFailedTests().size() + context.getPassedTests().size() + context.getSkippedTests().size();
        System.out.println("Execution de la " + index + "e methode");
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        System.out.println("a la fin de l'exécution de la méthode");
    }
}
