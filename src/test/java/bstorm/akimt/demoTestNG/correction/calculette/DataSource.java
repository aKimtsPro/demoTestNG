package bstorm.akimt.demoTestNG.correction.calculette;

import org.testng.annotations.DataProvider;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    @DataProvider
    public Object[][] additionData() {
        return new Object[][]{
                {2,2,4},
                {2,-2,0},
                {-2,2,0},
                {-2,-2,-4},
                { Integer.MAX_VALUE, 1, Integer.MIN_VALUE},
                { Integer.MIN_VALUE, -1, Integer.MAX_VALUE}
        };
    }

    @DataProvider
    public Object[][] soustractionData() {
        return new Object[][]{
                {2,2,0},
                {2,-2,4},
                {-2,2,-4},
                {-2,-2,0},
                { Integer.MAX_VALUE, -1, Integer.MIN_VALUE},
                { Integer.MIN_VALUE, 1, Integer.MAX_VALUE}
        };
    }

    @DataProvider
    public Object[][] multiplucationData() {
        return new Object[][]{
            {2,0,0},
            {2,2,4},
            {2,-2,-4},
            {-2,2,-4},
            {-2,-2,4},
            {Integer.MAX_VALUE, 2, -2},
            {Integer.MIN_VALUE, 2, 0}
        };
    }

    @DataProvider
    public Object[][] divisionData() {
        return new Object[][]{
                {3,2,1},
                {3,-2,-1},
                {-3,2,-1},
                {-3,-2,1},
        };
    }

    @DataProvider
    public Object[][] operationData() {

        List<Object[]> tableau = new ArrayList<>();

        for (Object[] objects : additionData()) {
            tableau.add(new Object[]{ objects[0], objects[1], '+', objects[2]});
        }
        for (Object[] objects : soustractionData()) {
            tableau.add(new Object[]{ objects[0], objects[1], '-', objects[2]});
        }
        for (Object[] objects : divisionData()) {
            tableau.add(new Object[]{ objects[0], objects[1], '/', objects[2]});
        }
        for (Object[] objects : multiplucationData()) {
            tableau.add(new Object[]{ objects[0], objects[1], '*', objects[2]});
        }

        for (Object[] objects : tableau) {
            System.out.printf("%d %d %c %d\n", objects[0], objects[1], objects[2], objects[3]);
        }

        return tableau.toArray(new Object[0][]);
    }

    public static void main(String[] args) {


       new DataSource().operationData();
    }
}
