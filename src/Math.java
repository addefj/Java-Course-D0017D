/**
 *  import scanner class
 *  define scanner method
 *  Declare variables
 *  ask for inputs
 *  calculate sum
 *  calculate difference
 *  calculate product
 *  calculate absolute value of difference
 *  calculate the mean
 *  calculate the maximum value
 *  calculate min value
 *  Print formatted list
 *
 * @author Your Name (LTU_username)
 * @version 1.0
 */

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        //Define scanner method
        Scanner userInput = new Scanner(System.in);

        //Declare variables
        int firstNum = 0;
        int secondNum = 0;
        int sum = 0;
        int product = 0;
        int difference = 0;
        int absolute = 0;
        float mean = 0.0f;
        int max = 0;
        int min = 0;
        float factor = 2.0f;

        //ask for input
        System.out.print("What is your first number? ");
        firstNum = userInput.nextInt();
        System.out.print("What is your second number? ");
        secondNum = userInput.nextInt();

        // calculate sum
        sum = firstNum + secondNum;

        //calculate difference
        difference = firstNum - secondNum;

        //Calculate product
        product = firstNum * secondNum;

        //calculate absolute value of difference

        //calculate the mean
        mean = (firstNum + secondNum) / factor;

        //calculate the maximum value
        max = java.lang.Math.max(firstNum, secondNum);

        //Calculate min value
        min = java.lang.Math.min(firstNum, secondNum);

        // Print formatted list
        System.out.printf("Total: %d \nDifference: %d \nProduct:  %d \nAverage Value: %.2f \nMaximum Value: %d \nMinimum Value: %d \n" , sum, difference, product, mean, max, min);
    }
}