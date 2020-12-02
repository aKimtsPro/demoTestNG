package bstorm.akimt.demoTestNG.before_after.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AbstractClassGest {

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("Before a test");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("After method");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){ // liée à la présente classe
        System.out.println("Before Class");
    }
}
