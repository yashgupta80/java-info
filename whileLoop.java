package info;

import java.sql.SQLOutput;

public class whileLoop {
    public static void main(String[] args){
        int even = 4;
        int finishedEven = 20;
        int count =0;
        int sum = 0;
        while (even <= finishedEven) {
            even++;
           if (!isEven(even)){
               continue;
           }
           count++;
            System.out.println("number is " + even);
               sum+= even;
           if (count == 5){
               break;
           }


        }
        System.out.println(sum);



//        System.out.println("total number even found " + count);


    }

    public static boolean isEven(int even){
        if(even %2 == 0){
            return true;
        }else {
        return false;
       }
    }
}
