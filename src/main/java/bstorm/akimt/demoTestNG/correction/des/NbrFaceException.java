package bstorm.akimt.demoTestNG.correction.des;

public class NbrFaceException extends IllegalArgumentException {

    public NbrFaceException() {
        super("Le nombre de face devrait être positif et pair");
    }
}
