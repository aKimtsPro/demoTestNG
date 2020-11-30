package bstorm.akimt.demoTestNG;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public int returnSame(int nbr){
        if(nbr == -1)
            throw new IllegalArgumentException("parameter should not be 1");

        return nbr;
    }

}
