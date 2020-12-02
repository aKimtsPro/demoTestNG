package bstorm.akimt.demoTestNG.before_after.suite;

import org.testng.annotations.*;

public class SuiteGest {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        System.out.println("Before suite");
    }


    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        System.out.println("After suite");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("After test");
    }


    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        System.out.println("Before test");
    }


    @BeforeGroups(groups = "group1")
    public void beforeGroup1(){
        System.out.println("Before group1");
    }

    @BeforeGroups(groups = "group2")
    public void beforeGroup2(){
        System.out.println("Before group2");
    }


    @AfterGroups(groups = "group1")
    public void afterGroup1(){
        System.out.println("After group1");
    }

    @AfterGroups(groups = "group2")
    public void afterGroup2(){
        System.out.println("After group2");
    }




}
