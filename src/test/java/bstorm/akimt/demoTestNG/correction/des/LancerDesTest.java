package bstorm.akimt.demoTestNG.correction.des;

import bstorm.akimt.demoTestNG.correction.des.BonusException;
import bstorm.akimt.demoTestNG.correction.des.LancerDesService;
import bstorm.akimt.demoTestNG.correction.des.NbrFaceException;
import bstorm.akimt.demoTestNG.correction.des.NbrLancerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups = "spring")
public class LancerDesTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private LancerDesService des;

    @Test(invocationCount = 1_000_000, invocationTimeOut = 3000, groups = "lancer")
    public void testD4(){
        int rslt = des.D4();
        Assert.assertTrue( rslt >= 1 && rslt <= 4);
    }

    @Test(invocationCount = 1_000_000, invocationTimeOut = 2000, groups = "lancer")
    public void testD6(){
        int rslt = des.D6();
        Assert.assertTrue( rslt >= 1 && rslt <= 6 );
    }

    @Test(invocationCount = 1_000_000, invocationTimeOut = 2000, groups = "lancer")
    public void testD20(){
        int rslt = des.D20();
        Assert.assertTrue( rslt >= 1 && rslt <= 20 );
    }

    @Test(invocationCount = 1_000_000, invocationTimeOut = 2000, groups = "lancer")
    public void testD100(){
        int rslt = des.D100();
        Assert.assertTrue( rslt >= 1 && rslt <= 100 );
    }


    @Test( expectedExceptions = NbrFaceException.class, groups = {"DCustom", "face"})
    public void testDCustom_NbrFaceException_pair(){
        des.DCustom(3, 1, 0);
    }

    @Test( expectedExceptions = NbrFaceException.class, groups = {"DCustom", "face"})
    public void testDCustom_NbrFaceException_strict_positif(){
        des.DCustom(0, 1, 0);
    }

    @Test( expectedExceptions = NbrLancerException.class, groups = {"DCustom", "nbrLancer"})
    public void testDCustom_NbrLancerException(){
        des.DCustom(4, 0, 0);
    }

    @Test( expectedExceptions = BonusException.class , groups = {"DCustom", "bonus"})
    public void testDCustom_BonusException_intervalle_inf(){
        des.DCustom(4, 1, -21);
    }

    @Test( expectedExceptions = BonusException.class, groups = {"DCustom", "bonus"})
    public void testDCustom_BonusException_intervalle_sup(){
        des.DCustom(4, 1, 21);
    }

    @Test( invocationCount = 1_000_000, invocationTimeOut = 2000, groups = {"DCustom", "lancer"})
    public void testDCustom(){
        int nbrFace = 8;
        int nbrLancer = 3;
        int bonus = 10;
        int rslt = des.DCustom(8, 3, 10);
        Assert.assertTrue(rslt >= (1 * nbrLancer) + bonus && rslt <= (nbrFace * nbrLancer) + bonus );
    }

}
