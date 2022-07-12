package info;

public class Array {
    public static void main(String[] args){
        int number[] = {2,1,-3,4,8};
        boolean shorted = true;
        int temp;
        for(int i = 0; i<number.length-1; i++){
            for (int j = 0; j<number.length-1; j++){
             if(number[j+1]<number[j]) {
                temp = number[j+1];
                 number[j+1] = number[j];
                 number[j] = temp;
                 //System.out.println(temp);
                 shorted = false;

             }
             }
        }
        for (int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }



        // array expression..
//        int myarray[] = getInteger(25);
//
//        for (int i =0; i<myarray.length; i++){
//            System.out.println("my array  " + i + " is " + myarray[i] );
//        }
        // saving the value or element in array..
        //myarray[5] = 20;

        //printing the array element ..
       // System.out.println("array element is " + myarray[5]);

        // print the element using for loop..|

//            for(int i = 0; i<myarray.length; i++){
//            myarray[i] = i*10;
//        }

    }
     //printing array element using method

//    public static void printarray(int[] array){
//        for (int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//    }

//    public static int[] getInteger(int number) {
//        int[] value = new int[number];
//        for (int i = 0; i < value.length; i++) {
//            value[i] = i*10;
//
//        }
//        return value;
//    }

}

