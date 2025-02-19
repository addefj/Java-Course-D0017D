//import scanner class

import java.util.Scanner;

//import class Main
public class ExchangeTable {


    public static void main(final String[] args) {

        //declare variables
        int change = 0;
        int initialChange = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;

        //create scanner
        Scanner userInput = new Scanner(System.in);

        //print input message
        System.out.println("Enter how much change you have:");

        //store user input
        initialChange = userInput.nextInt();
        change = initialChange;

        while (change > 0) {
            if (change >= 20) {
                change -= 20;
                twenty++;
            }
            else if (change >= 10) {
                change -= 10;
                ten++;
            }
            else if (change >= 5) {
                change -= 5;
                five++;
            }
            else {
                change -= 1;
                one++;
            }
        }

        //print exchange table
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%n|%-10d|%-10d|%-10d|%-10d|%-10d|" ,
                "Exchange", "20 kronor", "10 kronor", "5 kronor", "1 kronor", initialChange, twenty, ten, five, one);
    }
}