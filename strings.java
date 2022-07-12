package info;

public class strings {
    public static void main(String[] args){
        // declaration of String

        String Firstname = "welcometojava";

        // make new string
        //System.out.println(new String("yashu"));

        // function in string.
        // 1. concatenation of String..

        String LastName = "Gupta";
//        String fullName = Firstname + " " + LastName;
//        System.out.println(fullName);

        // find index of character of String..
        // 2. charAt(index int);
       // System.out.println(fullName.charAt(5));

        // find length of String..
        // 3. string.length;
        //System.out.println(fullName.length());

        // print a part of string
        // 4. substring(big index, last index);
        String part = "";
        //part = part.concat(Firstname.substring(3,5));


        // check char that present or not in string
        // 5. contain(charSequence s);
       // System.out.println(fullName.contains("n"));

        //compare the string it is equal or not..
        System.out.println(Firstname.compareTo("yash"));
        System.out.println(Firstname);

//        if( Firstname.compareTo(LastName) == 0){
//            System.out.println("string are equal");
//        }else {
//            System.out.println("string are not equal");
//        }

//        if(fullName.equals("Yash Gupta")) {
//            System.out.println("yes");
//        }else {
//            System.out.println("No");
//        }
    }
}
