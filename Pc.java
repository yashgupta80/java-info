package info;

public class Pc {
    private MotherBoard motherBoard;
    private Monitor monitor;
    private Case aCase;

    public Pc(MotherBoard motherBoard, Monitor monitor, Case aCase) {
        this.motherBoard = motherBoard;
        this.monitor = monitor;
        this.aCase = aCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getaCase() {
        return aCase;
    }
}
