package bstorm.akimt.demoTestNG.before_after;

import bstorm.akimt.demoTestNG.before_after.suite.AbstractClassGest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA extends AbstractClassGest {

    @Test(groups = "group2")
    public void test1(){
        System.out.println("test 1 from ClassA in group2");
    }

    @Test(groups = "group1")
    public void test2(){
        System.out.println("test 2 from ClassA in group1");
    }

    // region after/before
//
//    @BeforeClass(alwaysRun = true)
//    public void beforeClass(){ // liée à la présente classe
//        System.out.println("Before ClassA");
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void afterClass(){ // liée à la présente classe
//        System.out.println("After ClassA");
//    }

    // endregion
}
