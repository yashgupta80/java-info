package info;

public class Monitor {
    private String Model;
    private String Mainufacturing;
    private int Size;
    private Resolution resolution;

    public Monitor(String model, String mainufacturing, int size, Resolution resolution) {
        Model = model;
        Mainufacturing = mainufacturing;
        Size = size;
        this.resolution = resolution;
    }
    public void drowPixel(int x, int y){
        System.out.println("pixel is " + x + y + "resolution");
    }

    public String getModel() {
        return Model;
    }

    public String getMainufacturing() {
        return Mainufacturing;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
