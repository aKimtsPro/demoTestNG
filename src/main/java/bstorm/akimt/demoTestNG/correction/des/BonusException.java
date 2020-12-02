package bstorm.akimt.demoTestNG.correction.des;

public class BonusException extends IllegalArgumentException {

    public BonusException() {
        super("Le bonus devrait être entre -20 et 20");
    }
}
