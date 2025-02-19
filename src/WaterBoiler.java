//import scanner class

import java.util.Scanner;

//import class Main
public class WaterBoiler {

    public static void main(final String[] args) {

        int waterTemp = 0;

        Scanner userInput = new Scanner (System.in);

        System.out.println("What is the water temperature? ");
        waterTemp = userInput.nextInt();

        if (waterTemp < 0 || waterTemp > 100) {
            System.out.println("Error! Incorrect temperature");
        }
        if (waterTemp == 100 ) {
            System.out.println("Water is boiling");
        }
        if (waterTemp > 0 && waterTemp < 100 ) {
            System.out.println("Powersupply is on");
        }


    }
}