package bstorm.akimt.demoTestNG.correction.calculette;

public interface CalculetteService {

    int addition(int a, int b);
    int soustraction(int a, int b);
    int division(int a, int b);
    int multiplication(int a, int b);

    int operation(int a, int b, char ope);
}
