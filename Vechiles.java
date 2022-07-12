package info;

public class Vechiles {
    private String Name;
    private String ManufactringCountry;
    private boolean manual;
    private int wheels;
    private String color;
    private int speed;


    public Vechiles(String name, String manufactringCountry, boolean manual, int wheels, String color) {
        Name = name;
        ManufactringCountry = manufactringCountry;
        this.manual = manual;
        this.wheels = wheels;
        this.color = color;
    }

     public void move(int speed){
         System.out.println("car moveing " + speed + "km");
         this.speed = speed;
     }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManufactringCountry() {
        return ManufactringCountry;
    }

    public void setManufactringCountry(String manufactringCountry) {
        ManufactringCountry = manufactringCountry;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int stop(){
        return this.speed =0;
    }
}
