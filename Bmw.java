package info;

public class Bmw extends Car1{
     private int door;

    public Bmw() {
        super("BMW", "India", false, 4, "white");
        this.door = 4;
    }

    public void accelerate(int speed){
        if (speed == 0) {
            stop();
            changeGeer(1);
        }else if (speed>0 && speed <=10){
              changeGeer(1);
          }else if (speed >10 && speed<=20){
              changeGeer(2);
          }else if (speed >20 && speed <=30){
              changeGeer(4);
          }else {
              changeGeer(4);
          }
        }
    }