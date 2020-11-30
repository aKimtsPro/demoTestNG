package bstorm.akimt.demoTestNG.before_after;

import org.testng.annotations.*;

// suite - fait
// test - fait
// method - fait
// group2 - fait
// group1 - fait
// classA - fait
// classB - fait


// - - - before suite
// - - before test

// before ClassA
// - Before group2
// BeforeMethod defini dans la ClassA
// TODO: // A - 1 - group2
// AFTER_METHOD [ClassA]
// before group1
// BeforeMethod defini dans la ClassA
// TODO: // A - 2 - group1
// AFTER_METHOD [ClassA]
// - after ClassA
// - Before classB
// BEFORE_METHOD [ClassB]
// TODO: // B - 1 - group1
// after method defini dans ClassB
// After group1
// BEFORE_METHOD [ClassB]
// TODO: // B - 2 - group2 (depends on group1)
// after method defini dans ClassB
// After group2
// after classB


// - - after test
// - - - after suite

public class ClassB {

    @Test(groups = "group1")
    public void test1(){
        System.out.println("test 1 from ClassB in group1");
    }

    @Test(groups = "group2", dependsOnGroups = "group1")
    public void test2(){
        System.out.println("test 2 from ClassB in group2");
    }


    // region After/Before

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        System.out.println("Before suite");
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

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){ // liée à la présente classe
        System.out.println("Before ClassB");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("Before a test");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("After method");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("After ClassB");
    }

    @AfterGroups(groups = "group1")
    public void afterGroup1(){
        System.out.println("After group1");
    }

    @AfterGroups(groups = "group2")
    public void afterGroup2(){
        System.out.println("After group2");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("After test");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        System.out.println("After suite");
    }


    // endregion
}
