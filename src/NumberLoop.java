//import scanner class

import java.util.Scanner;

//import class Main
public class NumberLoop {

    public static void main(final String[] args) {

        boolean inputValue = false;
        int input = 0;

        Scanner userInput = new Scanner(System.in);

        while (!inputValue) {
            System.out.println("Please enter a number, or enter a negative number to quit");
            input = userInput.nextInt();
            if (input >= 0)
                System.out.println("You entered " + input);
            else {
                System.out.println("You entered " + input + ", I am quitting");
                inputValue = true;
            }

        }

    }
}