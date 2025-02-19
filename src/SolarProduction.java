//import scanner class

import java.util.Scanner;

/**
 *Ask for date
 *Imput date
 * CHeck if month is june or july
 * Input sunrise / check input
 * Input SUnset / check input
 * Calculate solar hours
 * Convert
 * Calculate solar production
 * Print
 * @author Andreas Fjällid (andfja-5)
 * @version 1.0
 */

//import class Main
public class SolarProduction {

    //declare constants
    static final String INVALID_HOURS = "Error! Invalid time. Hours must be between 0 and 23.";
    static final String INVALID_MINUTES = "Error! Invalid time. Minutes must be between 0 and 59.";
    static final String INVALID_MONTH = "Error! Invalid Month.";
    static final String INVALID_DAY = "Error! Invalid Day.";
    static final String INVALID_SUNRISE = "Error! Sunrise must be before sunset.";
    static final String INVALID_FORMAT_DATE = "Error! Invalid date format.";
    static final String INVALID_FORMAT_TIME = "Error! Invalid time format.";

    static final int JUNE = 6;
    static final int JULY = 7;
    static final int DAYS_IN_JUNE_MAX = 30;
    static final int DAYS_IN_JULY_MAX = 31;
    static final int DAYS_IN_MONTH_MIN = 0;
    static final int MAX_HOURS = 23;
    static final int MIN_HOURS = 0;
    static final int MAX_MINUTES = 59;
    static final int MIN_MINUTES = 0;
    static final int CONVERT_TO_KW = 1000;
    static final int CONVERT_TO_HOURS = 60;
    static final double KW_PRICE = 0.9;
    static final double PANEL_EFFICENCY = 0.2;
    static final double PANEL_AREA = 1.7;
    static final int PANEL_AMOUNT = 26;
    static final int SUN_RADIATION = 166;

    public static void main(final String[] args) {

        /* The two main math equations are
      * 1) production (in kWh) = SOLAR_RADIATION * EFFICIENCY * PANEL_AREA * hours * NUM_OF_PANELS / 1000; //Note the equation in instruction is in Wh, so we divide by 1000 to get kWh as price is per kWh
      *  2) value = production * ELECTRIC_PRICe
      *  where,
      *  NUM_OF_PANELS = 26;
      *  PANEL_HEIGHT = 1; //Units is meters, so no conversion is needed as SOLAR_RADIATION is per m^2
      *  SOLAR_RADIATION = 166; //this is in Wh units, hence divide by 1000 in eq 1 above to convert to kWh
      *  PANEL_WIDTH = 1.7; //Units is meters, so no conversion is needed as SOLAR_RADIATION is per m^2
      *  PANEL_AREA = PANEL_WIDTH * PANEL_HEIGHT;
      *  EFFICIENCY = 0.2; //(instruction says 20 percent efficiency, so, 20/100 = 0.2)
      *  ELECTRIC_PRICE = 0.9; //this is per kWh, so we calculate production in kWh in eq 1
      *  DAYS_IN_JUNE_MAX = 30;
      */


        //declare variables
        double hours = 0.0;
        double minutes = 0.0;

        int month = 0;
        int day = 0;
        double finalSunriseHours = 0.0;
        double finalSunsetHours = 0.0;
        double totalSolarHours = 0.0;

        double electricProduction = 0.0;
        double earnings = 0.0;

        //Define scanner method
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter today's date [mm-dd]");
        //set acceptable delimiter
        userInput.useDelimiter("[-|\\s]+");

        //check if date has the right format
        if (userInput.hasNextInt()) {
            month = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_DATE);
            System.exit(0);
        }
        if (userInput.hasNextInt()) {
            day = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_DATE);
            System.exit(0);
        }

        //Check if month and day is valid
        if (month != JUNE && month != JULY) {
            System.out.print(INVALID_MONTH);
            System.exit(0);
        }
        if (month == JUNE) {
            if (day <= DAYS_IN_MONTH_MIN || day > DAYS_IN_JUNE_MAX) {
                System.out.print(INVALID_DAY);
                System.exit(0);
            }
        }
        if (month == JULY) {
            if (day <= DAYS_IN_MONTH_MIN || day > DAYS_IN_JULY_MAX) {
                System.out.print(INVALID_DAY);
                System.exit(0);
            }
        }
        //System.out.println(month + "-" + day);

        System.out.println("Enter the time of sunrise [hh:mm]");

        userInput.useDelimiter("[:|\\s]+");

        //check if time has the right format
        if (userInput.hasNextInt()) {
            hours = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_TIME);
            System.exit(0);
        }
        if (userInput.hasNextInt()) {
            minutes = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_TIME);
            System.exit(0);
        }
        if (hours < MIN_HOURS || hours > MAX_HOURS) {
            System.out.println(INVALID_HOURS);
            System.exit(0);
        }
        if (minutes < MIN_MINUTES || minutes > MAX_MINUTES) {
            System.out.println(INVALID_MINUTES);
            System.exit(0);
        }

        //calculate sunrisehours
        finalSunriseHours = minutes / CONVERT_TO_HOURS + hours;

        System.out.println("Enter the time of sunset [hh:mm]");
        //check if time has the right format
        if (userInput.hasNextInt()) {
            hours = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_TIME);
            System.exit(0);
        }
        if (userInput.hasNextInt()) {
            minutes = userInput.nextInt();
        } else {
            System.out.println(INVALID_FORMAT_TIME);
            System.exit(0);
        }
        if (hours < MIN_HOURS || hours > MAX_HOURS) {
            System.out.println(INVALID_HOURS);
            System.exit(0);
        }
        if (minutes < MIN_MINUTES || minutes > MAX_MINUTES) {
            System.out.println(INVALID_MINUTES);
            System.exit(0);
        }

        //calculate sunsethours
        finalSunsetHours = minutes / CONVERT_TO_HOURS + hours;

        //sunrise before sunset check
        if (finalSunsetHours <= finalSunriseHours) {
            System.out.println(INVALID_SUNRISE);
            System.exit(0);
        }

        //calculate solar hours
        totalSolarHours = finalSunsetHours - finalSunriseHours;

        //calculate solar production
        //Production (Wh) = Solar radiation (Wh / m2 / hour) x efficiency x surface (m2) x hours of sunshine
        electricProduction = SUN_RADIATION * PANEL_EFFICENCY * (PANEL_AREA * PANEL_AMOUNT) * totalSolarHours / CONVERT_TO_KW;

        //calculate money earned
        earnings = electricProduction * KW_PRICE;

        //print seperator line
        System.out.println("==========================================");

        //print results
        System.out.printf("Sun Hours: %.2f Hours %nThe production on %d/%d is: %.2f kWh to a value of: SEK %.2f" , totalSolarHours, day, month, electricProduction, earnings);

        //System.out.println(totalSolarHours);
        //System.out.printf("%d %d%n" , hours, minutes);
        //System.out.printf("%d %d%n" , finalSunsetHours, finalSunsetMinutes);


    }
}