package info;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // scanner class: using for read user input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date Of Birth: ");
        boolean hasNextInt = sc.hasNextInt();

        // declaer integer variable in scanner class;


        if (hasNextInt) {
            int age_of_Birth = sc.nextInt();
            sc.nextLine();// handling nextLine character(enter key)
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            int age = 2022 - age_of_Birth;
            if (age >=0 && age<=100) {
                System.out.println("your name is " + name + ", and you are " + age + " year old.");
            }else {
                System.out.println("Invalid year of birth: ");
            }

        }else{
                System.out.println("unable to calculate your year :( ");
            }
            sc.close();
    }
}
