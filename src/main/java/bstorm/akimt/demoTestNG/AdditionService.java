package bstorm.akimt.demoTestNG;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {

    public int addAbsol(int a, int b){
        if( a < 0 )
            a = -a;

        if( b < 0 )
            b = -b;

        return a+b;
    }

}
