//import scanner class

import java.util.Random;
import java.util.Scanner;

//import class Main
public class DiceRoller {


    public static void main(final String[] args) {

        //declare variables
        int dices = 0;
        int randomNumber = 0;
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        String six = "";
        String numberHolder = "";

        //create scanner
        Scanner userInput = new Scanner(System.in);

        //ask for number of dices and store the amount
        System.out.println("How many dices do you want to roll?");
        dices = userInput.nextInt();

        //generate random numbers for a 6-sided dice, and rolling the amount requested
        for (int i = 0; i < dices; i++) {
            Random rand = new Random();
            randomNumber = rand.nextInt(6);
            randomNumber++; //adding + 1 for the cut decimal
            System.out.print(randomNumber + " ");
            switch (randomNumber) {
                case 1:
                    one = one + "#";
                    break;
                case 2:
                    two = two + "#";
                    break;
                case 3:
                    three = three + "#";
                    break;
                case 4:
                    four = four + "#";
                    break;
                case 5:
                    five = five + "#";
                    break;
                default:
                    six = six + "#";
                    break;

            }
        }
        System.out.printf("%n1: %s %n2: %s %n3: %s %n4: %s %n5: %s %n6: %s" , one, two, three, four, five, six);
        //System.out.printf("2: %s" , two);

    }
}