package info;

public class Car {
    private int wheels;
    private int doors;
    private String carName;
    private String model;

    public void setCarName(String carName){
        carName.toLowerCase();
        if (carName.equals("bmw x series") || carName.equals("bmw x2 series")){
            this.carName = carName;
        }else {
            this.carName = "unKnown";
        }

    }
    public String getCarName(){
        return carName;
    }
}
