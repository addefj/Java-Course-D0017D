//import scanner class

import java.util.Scanner;

//import class Main
public class Scoops {

    static final int ONE_SCOOP = 10;
    static final int TWO_SCOOP = 15;
    static final int THREE_SCOOP = 20;

    public static void main(final String[] args) {
        int allowance = 0;
        int allowanceLeft = 0;
        int counterOneScoop = 0;
        int counterTwoScoop = 0;
        int counterThreeScoop = 0;

        Scanner userInput = new Scanner (System.in);

        System.out.print("What are her weekly allowance? ");
        allowance = userInput.nextInt();

        while (allowance >= THREE_SCOOP) {
            allowance -= THREE_SCOOP;
            counterThreeScoop++;
        }
        while (allowance >= TWO_SCOOP) {
            allowance -= TWO_SCOOP;
            counterTwoScoop++;
        }
        while (allowance >= ONE_SCOOP) {
            allowance -= ONE_SCOOP;
            counterOneScoop++;
        }
        System.out.printf("She can buy the following: %nAmount of Three scoops %d %nAmount of two scoops %d %nAmount of One scoops %d%n", counterOneScoop, counterTwoScoop, counterThreeScoop);
        System.out.printf("She has %d allowance left ", allowance);
    }
}