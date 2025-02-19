//import scanner class

import java.util.Scanner;

//import class Main
public class AgeCheck {

    public static void main(final String[] args) {

        Scanner userInput = new Scanner(System.in);
        int inputInt = 0;
        String emptyScanner = "";
        boolean check = true;
   /*
        do {
            System.out.println("Enter your age as a number please: ");
            if (userInput.hasNextInt()) {
                inputInt = userInput.nextInt();
                if (inputInt < 18) {
                    System.out.println("You are too young for driving!");
                    check = false;
                } else {
                    System.out.println("Congratulations! You are ready to start driving!");
                    check = false;
                }
            }
            else {
                emptyScanner = userInput.nextLine();
                System.out.println(emptyScanner + " is not a number!");
            }
        } while (check);

        //System.out.println("You got out of the loop!");
    */
        System.out.println("Enter your age please: ");

        while (check) {
            if (!userInput.hasNextInt()) {
                emptyScanner = userInput.nextLine();
                System.out.println(emptyScanner + " is not a number! Try again");
            }
            else {
                check = false;
            }

        }

        if (userInput.nextInt() < 18)
            System.out.println("You are too young for driving!");
        else
            System.out.println("Congratulations! You are ready to start driving!");

        //System.out.println("You got out of the loop!");
    }
}