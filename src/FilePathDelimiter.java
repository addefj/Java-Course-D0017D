/**
 *
 *  1. Import scanner class
 *  2. state scanner method
 *  3. declare variables
 *  4. Print input 3 times
 *
 *
 * @author Your Name (LTU_username)
 * @version 1.0
 */

import java.util.Scanner;

public class FilePathDelimiter
{
    public static void main(String args[])
    {
        //define scanner method
        Scanner userInput = new Scanner (System.in);

        //set delimeter to ":" , "/" or whitespace
        userInput.useDelimiter("[:|/|\\s]+");

        //print message "Enter the path: "
        System.out.println("Enter the path: ");

        System.out.println(userInput.next());
        System.out.println(userInput.next());
        System.out.println(userInput.next());

    }
}