package info;

public class Car1 extends Vechiles {
    private double price;
    private int currentgeer;


    public Car1(String name, String manufactringCountry, boolean manual, int wheels, String color) {
        super(name, manufactringCountry, manual, wheels, color);
        this.price = 500000.00;
        this.currentgeer = 1;

    }
    @Override
    public void move(int speed) {
        System.out.println("Car1.move(): " + speed + "km running");
        super.move(speed);

    }
    public void changeGeer(int currentgeer){
        this.currentgeer = currentgeer;
        System.out.println("gheer change: " + currentgeer );
    }


}
