package bstorm.akimt.demoTestNG.demoProg;


import org.testng.Assert;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoProgTest implements IHookable {

    @Test(groups = "demoProg")
    @Parameters({"a","b"})
    public void testProgParam(int a, @Optional int b){
        System.out.println("in test");
        Assert.assertTrue(true);
    }

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        System.out.println("  -\n before test hoocked truc\n  -");
        iHookCallBack.runTestMethod(iTestResult);
        System.out.println("  -\n after test hoocked truc\n  -");
    }
}
