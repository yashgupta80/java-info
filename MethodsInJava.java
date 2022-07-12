package info;

public class MethodsInJava {
    public static void main(String[] args){
        // Methods in java..]
        // this is the main method;
        calculateScore(true, 800, 5, 200);

    }
    // we can create another method outer the block of main method;

    public static void calculateScore(boolean gameOver, int Score, int levelCompleted, int bonus){
        int finalScore = Score + (levelCompleted * bonus);
          finalScore +=  1000;
        System.out.println("result was " + finalScore);
    }
}
