package bstorm.akimt.demoTestNG.dataProvider;

import bstorm.akimt.demoTestNG.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SpringBootTest
public class DataTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private AdditionService service;

    @Test(groups = "data", dataProvider = "dataSource", dataProviderClass = DataSource.class )
    public void test(int a, int b, int expected){
        Assert.assertEquals(service.addAbsol(a, b), expected );
    }

    @Test(groups = "data", dataProvider = "dataSource", dataProviderClass = DataSource.class)
    public void test2(Integer[] ints){
        if(ints.length < 3)
            Assert.fail("pas assez d'info dans le data provider");

        Assert.assertEquals(service.addAbsol(ints[0], ints[1]), (int)ints[2]);
    }



}
