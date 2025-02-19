//import scanner class

import java.util.Scanner;

//import class Main
public class TotalSeconds {

    static final int CONVERT_HOURS = 3600;
    static final int CONVERT_MINUTES = 60;

    public static void main(final String[] args) {

        //declare variables
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        //create scanner
        Scanner userInput = new Scanner(System.in);

        //print input message
        System.out.println("Enter time in format hh/mm/ss: ");

        //set delimiters
        userInput.useDelimiter("[/|\\s]+");

        //store user input
        hours = userInput.nextInt();
        minutes = userInput.nextInt();
        seconds = userInput.nextInt();

        //convert hours and minutes to seconds
        totalSeconds = (hours * CONVERT_HOURS) + (minutes * CONVERT_MINUTES + seconds);

        //print result
        System.out.println(totalSeconds);
    }
}