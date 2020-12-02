package bstorm.akimt.demoTestNG.correction.calculette;

import org.springframework.stereotype.Service;

@Service
public class CalculetteServiceImpl implements CalculetteService {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int operation(int a, int b, char ope){
        switch(ope){
            case '+':
                return addition(a, b);
            case '-':
                return soustraction(a, b);
            case '/':
                return division(a, b);
            case '*':
                return multiplication(a, b);
            default:
                throw new IllegalArgumentException("operation invalide");
        }

    }
}
