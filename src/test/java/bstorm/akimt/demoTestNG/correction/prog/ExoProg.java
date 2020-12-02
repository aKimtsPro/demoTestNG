package bstorm.akimt.demoTestNG.correction.prog;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class ExoProg {

    public static void main(String[] args) {

        List<XmlSuite> suites = new ArrayList<>();
        XmlSuite suite = new XmlSuite();
        suite.setName("correction suite");
        suites.add(suite);

        XmlTest test = new XmlTest();
        test.setName("correction test");

        test.addExcludedGroup("lancer");
        test.addIncludedGroup("calculette");
        test.addIncludedGroup("spring");

        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("bstorm.akimt.demoTestNG.correction.calculette.CalculetteTest"));
        classes.add(new XmlClass("bstorm.akimt.demoTestNG.correction.des.LancerDesTest"));

        test.setClasses(classes);
        test.setSuite(suite);
        suite.addTest(test);

        TestNG testNG = new TestNG();
        testNG.addListener(new CorrectionTestListener());
        testNG.setXmlSuites(suites);
        testNG.run();
    }

}
