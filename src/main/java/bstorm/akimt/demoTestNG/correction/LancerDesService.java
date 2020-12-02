package bstorm.akimt.demoTestNG.correction;

import org.springframework.stereotype.Service;


public interface LancerDesService {

    int D4();
    int D6();
    int D20();
    int D100();

    int DCustom(int nbrFace, int nbrLancer, int bonus);

}
