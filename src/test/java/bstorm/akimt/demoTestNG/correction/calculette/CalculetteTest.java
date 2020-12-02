package bstorm.akimt.demoTestNG.correction.calculette;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups="calculette")
public class CalculetteTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private CalculetteService service;

    @Test(groups = "addition", dataProvider = "additionData", dataProviderClass = DataSource.class)
    public void additionTest(int a, int b, int expected){
        Assert.assertEquals(service.addition(a, b), expected);
    }

    @Test(groups = "soustraction", dataProvider = "soustractionData", dataProviderClass = DataSource.class)
    public void soustractionTest(int a, int b, int expected){
        Assert.assertEquals(service.soustraction(a,b), expected);
    }

    @Test(groups = "multiplication", dataProvider = "multiplucationData", dataProviderClass = DataSource.class)
    public void multiplicationTest(int a, int b, int expected){
        Assert.assertEquals(service.multiplication(a,b), expected);
    }

    @Test(groups = "division", dataProvider = "divisionData", dataProviderClass = DataSource.class)
    public void divisionTest(int a, int b, int expected){
        Assert.fail();
        Assert.assertEquals(service.division(a,b), expected);
    }

    @Test(groups = "division", expectedExceptions = ArithmeticException.class)
    public void divisionTestException(){
        service.division(3,0);
    }

    @Test(
            groups = "operation",
            dataProvider = "operationData",
            dataProviderClass = DataSource.class,
            dependsOnGroups = {"addition", "soustraction", "multiplication", "division"}
    )
    public void operationTest(int a, int b, char ope, int expected){
        Assert.assertEquals(service.operation(a,b,ope),expected);
    }

    @Test(
            groups="operation",
            expectedExceptions = ArithmeticException.class,
            dependsOnMethods = "divisionTestException"
    )
    public void operationTestException(){
        service.operation(3,0,'/');
    }

}
