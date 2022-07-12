package info;

public class MotherBoard {
    private String Model;
    private String Manufacturing;
    private int ramSlots;
    private int cardSlots;
    // constructor..
      public MotherBoard(String Model, String Manufacturing, int ramSlots, int cardSlots ){
          this.Model = Model;
          this.Manufacturing = Manufacturing;
          this.ramSlots = ramSlots;
          this.cardSlots = cardSlots;
      }

      // method
    public void RunningVresion(String version){
        System.out.println("your window " + version + " version is loaded....") ;
    }
      // getter...
      public String getModel() {
        return Model;
    }
    public String getManufacturing(){
          return Manufacturing;
    }
    public int getRamSlots(){
          return ramSlots;
    }
    public int getCardSlots(){
          return cardSlots;
    }

}
