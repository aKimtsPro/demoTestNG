package bstorm.akimt.demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class DummyServiceTest {

    private DummyService dService = new DummyService();

    @Test(enabled = false)
    public void assertions(){
        Assert.assertEquals(dService.returnSame(5), 5);
        Assert.assertEquals(dService.returnSame(5), 5, "returned value shoud be 5");
        Assert.assertNotEquals(dService.returnSame(5),4);

        Assert.assertSame("a", "a");
        Assert.assertNotSame("a", new String("a"));

        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertNull(null);
        Assert.assertNotNull("not null");

        Assert.assertThrows(() -> dService.returnSame(-1));
        Assert.assertThrows(IllegalArgumentException.class, () -> dService.returnSame(-1));

        Assert.fail();
    }

    @Test(description = "test dans le cas 5", groups = {"definedGroup"})
    public void testReturnSameCase_5(){
        System.out.println("case 5");
        Assert.assertEquals(dService.returnSame(5), 6, "returned value shoud be 5");
    }

    @Test(dependsOnMethods = "testReturnSameCase_5", alwaysRun = true)
    public void testReturnSameCase_minus1(){
        System.out.println("case -1");
        Assert.assertThrows(IllegalArgumentException.class, () -> dService.returnSame(-1));
    }

    @Test(expectedExceptions = {Exception.class, IllegalArgumentException.class})
    public void testThrowsException() throws Exception {
        System.out.println("throws exception with expectedExceptions");
        throw new Exception();
    }

    @Test(timeOut = 1000, priority = -1)
    public void timedTest(){
        while(true);
    }

    @Test(invocationCount = 3, invocationTimeOut = 1000, priority = 5)
    public void testSleep(){
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }

}