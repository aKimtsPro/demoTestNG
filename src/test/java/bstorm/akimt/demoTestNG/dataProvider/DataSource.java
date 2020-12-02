package bstorm.akimt.demoTestNG.dataProvider;

import org.testng.annotations.DataProvider;

public class DataSource {

    @DataProvider
    public Object[][] dataSource(){
        return new Object[][]{
                { 2, 3, 5},
                { 2, -3, 5},
                { -2, 3, 5},
                { -2, -3, 5}
        };
    }
}
