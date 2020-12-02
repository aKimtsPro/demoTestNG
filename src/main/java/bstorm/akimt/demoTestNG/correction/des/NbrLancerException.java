package bstorm.akimt.demoTestNG.correction.des;

public class NbrLancerException extends IllegalArgumentException {

    public NbrLancerException() {
        super("nbrLancer devrait être positif et non nul.");
    }
}
