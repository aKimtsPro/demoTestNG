package bstorm.akimt.demoTestNG.correction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

@Service
public class LancerDesImpl implements LancerDesService {

    @Override
    public int D4() {
        return new Random().nextInt(4) + 1;
    }

    @Override
    public int D6() {
        return new Random().nextInt(6) + 1;
    }

    @Override
    public int D20() {
        return new Random().nextInt(20) + 1;
    }

    @Override
    public int D100() {
        return new Random().nextInt(100) + 1;
    }

    @Override
    public int DCustom(int nbrFace, int nbrLancer, int bonus) {

        if(nbrFace <= 0 || nbrFace%2 != 0 )
            throw new NbrFaceException();

        if(nbrLancer <= 0)
            throw new NbrLancerException();

        if(bonus < -20 || bonus > 20)
            throw new BonusException();

        int total = bonus;
        for (int i = 0; i < nbrLancer; i++) {
            total += new Random().nextInt(nbrFace) + 1;
        }
        return total;

    }
}
