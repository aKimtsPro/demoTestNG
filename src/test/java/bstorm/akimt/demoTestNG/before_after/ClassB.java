package bstorm.akimt.demoTestNG.before_after;

import bstorm.akimt.demoTestNG.before_after.suite.AbstractClassGest;
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

public class ClassB extends AbstractClassGest {

    @Test(groups = "group1")
    public void test1(){
        System.out.println("test 1 from ClassB in group1");
    }

    @Test(groups = "group2", dependsOnGroups = "group1")
    public void test2(){
        System.out.println("test 2 from ClassB in group2");
    }

}
