package info;

public class Composition
{
    public static void main(String[] args){
        MotherBoard motherBoard = new MotherBoard("20BS", "asus",4,6);
         Case acase  = new Case("102s","accer", new Dimension(12,15, 5));
         Monitor monitor = new Monitor("204s", "LG", 15, new Resolution(1256, 1445));
            Pc pc = new Pc(motherBoard, monitor, acase);
              pc.getMonitor().drowPixel(14,14);
             pc.getMotherBoard().RunningVresion("Window 0.1");
              System.out.println(pc);
    }
}
