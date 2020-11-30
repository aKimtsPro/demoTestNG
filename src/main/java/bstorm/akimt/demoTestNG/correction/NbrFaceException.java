package bstorm.akimt.demoTestNG.correction;

public class NbrFaceException extends IllegalArgumentException {

    public NbrFaceException() {
        super("Le nombre de face devrait être positif et pair");
    }
}
