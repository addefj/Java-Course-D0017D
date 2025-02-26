//import scanner class

import java.util.Random;
import java.util.Scanner;

//import class Main
public class DiceRollerArray {


    public static void main(final String[] args) {

        //declare variables
        int numberOfDices = 0;
        int randomNumber = 0;
        int[] frequency = new int[7];

        //create scanner
        Scanner userInput = new Scanner(System.in);

        //ask for number of dices and store the amount
        System.out.println("How many dices do you want to roll?");
        numberOfDices = userInput.nextInt();

        //generate random numbers for a 6-sided dice, and rolling the amount requested
        for (int i = 0; i < numberOfDices; i++) {
            Random rand = new Random();
            randomNumber = rand.nextInt(6) +1;
            System.out.print(randomNumber + " ");
            frequency[randomNumber] = frequency[randomNumber] +1;
        }
        for (int diceNr = 1; diceNr <= 6; diceNr++) {
            System.out.print("\n" + diceNr + ": " );
            for(int i = 0; i < frequency[diceNr]; i++) {
                System.out.print("#");
            }
        }
    userInput.close(); //close scanner
    }
}