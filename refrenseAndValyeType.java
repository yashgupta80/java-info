package info;

import java.util.Arrays;

public class refrenseAndValyeType {
    public static void main(String[] args) {

        // value type...
//        int myInt = 10;
//        int anotherInt = myInt;
//
//        System.out.println("myIntValue " + myInt);
//        System.out.println("anotherValue " + anotherInt);
//
//        anotherInt++;
//
//        System.out.println("myIntValue change " + myInt);
//        System.out.println("anotherValue change " + anotherInt);
//
//        myInt = 20;
//        System.out.println("myInt " + myInt);

        // Reference type...

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 5;

        System.out.println("myArray " + Arrays.toString(myArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
        anotherArray = new int[]{5,4,6,8,2};
        modify(myArray);
        System.out.println("myArray modified " + Arrays.toString(myArray));
        System.out.println("another modified " + Arrays.toString(anotherArray));


    }

    public static void modify(int[] array){
        array[0] = 2;

    }

}
