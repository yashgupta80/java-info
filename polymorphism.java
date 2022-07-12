package info;

 class carr {
     private boolean engine;
     private int cylinder;
     private int wheels;
     private String name;

     public carr(int cylinder,  String name) {
         this.cylinder = cylinder;
         this.wheels = 4;
         this.name = name;
         this.engine = true;
     }

     public String startEngine(){
         return "car -> startEngine";
     }
     public String accelerate(){
         return "car -> accelerating";
     }
     public String brake(){
         return "car -> breaking";

     }

 }
 class BMW extends carr{
     public BMW(int cylinder, String name) {
         super(cylinder, name);
     }
     public String startEngine(){
         return "BMW -> startEngine";
     }
     public String accelerate(){
         return "BMW -> accelerating";
     }
     public String brake(){
         return "BMW -> braking";
     }
 }

public class polymorphism {
    public static void main(String[] args){
        carr car1 = new carr(8,"basic");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

    }
}
