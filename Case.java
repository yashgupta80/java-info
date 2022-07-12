package info;

public class Case {
    private String Model;
    private String Mainufacturing;
    private Dimension deminsion;

    public Case(String model, String mainufacturing, Dimension deminsion) {
        Model = model;
        Mainufacturing = mainufacturing;
        this.deminsion = deminsion;
    }

    public String getModel() {
        return Model;
    }

    public String getMainufacturing() {
        return Mainufacturing;
    }

    public Dimension getDeminsion() {
        return deminsion;
    }
}
