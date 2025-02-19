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

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGen {
    public static void main(String[] args) {

        //Define scanner method
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(6);
            System.out.println(++randomNumber);
        }
    }
}