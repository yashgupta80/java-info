package info;

public class codeBlock {
    public static void main(String[] args){
        // if any variable statement and expression written in a...
        // block then it will not run out block
         boolean gameOver = true;
         int score = 800;
         int levelComplete = 5;
         int bonus = 100;

         //if and else recap... or conditional operator;
        /* if(score > 500 && score <700 ){
             System.out.println("score greater then 500 and less then 700");
         }else if(score > 1000){
             System.out.println("score is lesser then 1000");
         }else{
             System.out.println("score is invalid");
         }
         */

        if (gameOver){
            int finalScore = score+(levelComplete*bonus);
            System.out.println("final score is " + finalScore);
        }

        int secondScore = 10000;
        int leveComplete2 = 8;
        int bonus2 = 200;

        if (gameOver){
            int secondFinalScore = secondScore+(leveComplete2*bonus2);
            System.out.println("second FinalScore " + secondFinalScore);
        }


    }
}
