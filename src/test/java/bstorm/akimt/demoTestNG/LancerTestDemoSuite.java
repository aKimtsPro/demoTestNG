package bstorm.akimt.demoTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LancerTestDemoSuite {

    @Test(groups = "lancer")
    public void testSuite(){
        System.out.println("ce test ne sera pas exécuté par la suite");
    }

    @Test(groups = "param")
    @Parameters("suiteParameter")
    public void testSuiteParam(String param){
        System.out.println("le test testSuiteParam est lancé avec le param : " + param);
    }
}
