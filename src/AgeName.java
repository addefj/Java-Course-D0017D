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

public class AgeName
{
    public static void main(String args[])
    {
        int age;
        String name;
        String ageString;

        Scanner userInput = new Scanner(System.in);

        System.out.print("How old are you?: ");
        //age = userInput.nextInt();
        ageString = userInput.nextLine();
        age = Integer.parseInt(ageString);
        System.out.print("What is your name?: ");
        name = userInput.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old");
    }
}