//import scanner class

import java.util.Scanner;

//import class Main
public class LunchTime {

    public static void main(final String[] args) {
        int currentTime = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What time is it?");
        currentTime = userInput.nextInt();
/*
        if (currentTime >= 1200 && currentTime <= 1300)
            System.out.println("It's time for lunch!");
        else
            System.out.println("Go back to work!");
*/
        if (currentTime >= 1200)
            if (currentTime <=1300)
                System.out.println("It's time for lunch!");
            else
                System.out.println("Go back to work!");
        else
            System.out.println("Go back to work!");
    }
}