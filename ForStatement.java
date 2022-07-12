package info;

public class ForStatement {
    public static void main(String[] args){
        // for(initilize termination; increment)
        for (int i=8; i>3; i--) {
            System.out.println(calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interest){
            return amount*(interest/100);

    }
}
