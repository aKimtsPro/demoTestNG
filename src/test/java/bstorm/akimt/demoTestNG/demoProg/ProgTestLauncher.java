package bstorm.akimt.demoTestNG.demoProg;

import bstorm.akimt.demoTestNG.listener.CustomInvokedMethodListener;
import bstorm.akimt.demoTestNG.listener.CustomSuiteListener;
import bstorm.akimt.demoTestNG.listener.CustomTestListener;
import org.testng.TestNG;
import org.testng.xml.*;

import java.util.ArrayList;
import java.util.List;

public class ProgTestLauncher {

    public static void main(String[] args) {

        XmlSuite suite = new XmlSuite();
        suite.setName("desSuite");
//        suite.setThreadCount(2);
//        suite.setParallel(XmlSuite.ParallelMode.METHODS);

        XmlTest test = new XmlTest();
        test.setName("desTest");

        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("bstorm.akimt.demoTestNG.correction.des.LancerDesTest"));
        classes.add(new XmlClass("bstorm.akimt.demoTestNG.demoProg.DemoProgTest"));

        List<String> includes = new ArrayList<>();
        includes.add("lancer");
        includes.add("bonus");
        includes.add("demoProg");

        List<String> excludes = new ArrayList<>();
        excludes.add("lancer");

        test.setClasses(classes);
        test.setIncludedGroups(includes);
        test.setExcludedGroups(excludes);
        test.addParameter("a", "2");
        test.addParameter("b", "3");

        test.setSuite(suite);
        suite.addTest(test);

        List<XmlSuite> xmlSuites = new ArrayList<>();
        xmlSuites.add(suite);

        TestNG testNG = new TestNG();
        testNG.addListener( new CustomTestListener() );
        testNG.addListener( new CustomSuiteListener() );
        //testNG.addListener( new CustomInvokedMethodListener());
        testNG.setXmlSuites(xmlSuites);
        testNG.run();

    }
}
