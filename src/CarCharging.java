/**
 * Describe briefly your program in steps.
 * 1. Declare Variables and constants
 * 2. Calculate effect for each of the 5 current
 * 3. Calculate charge time for each effect
 * 4. Round numbers
 * 5. Print formatted table
 * @author Andreas Fjällid (andfja-5)
 */
import java.lang.Math;
public class CarCharging {
    public static final double BATTERY_KW = 35.8;
    public static final double W_TO_KW = 1000;
    public static final double A10 = 10.0;
    public static final double A16 = 16.0;
    public static final double A32 = 32.0;
    public static final double V230 = 230.0;
    public static final double V400 = 400.0;
    public static final int SCALE_FACTOR = 2;
    public static final int SCALE_TEN = 10;

    public static void main(final String[] args) {

        //variables for charge power
        double chargePow1 = 0.0;
        double chargePow2 = 0.0;
        double chargePow3 = 0.0;
        double chargePow4 = 0.0;
        double chargePow5 = 0.0;

        //variable for charge time
        double chargeTime1 = 0.0;
        double chargeTime2 = 0.0;
        double chargeTime3 = 0.0;
        double chargeTime4 = 0.0;
        double chargeTime5 = 0.0;

        //declare scale
        int noOfDecimals = SCALE_FACTOR;
        double scale = 0.0;
        scale = Math.pow(SCALE_TEN, noOfDecimals);

        //calculate effect
        chargePow1 = A10 * V230 / W_TO_KW;
        chargePow2 = A16 * V230 / W_TO_KW;
        chargePow3 = Math.sqrt(3) * A10 * V400 / W_TO_KW;
        chargePow4 = Math.sqrt(3) * A16 * V400 / W_TO_KW;
        chargePow5 = Math.sqrt(3) * A32 * V400 / W_TO_KW;

        //calculate charge time
        chargeTime1 = BATTERY_KW / chargePow1;
        chargeTime2 = BATTERY_KW / chargePow2;
        chargeTime3 = BATTERY_KW / chargePow3;
        chargeTime4 = BATTERY_KW / chargePow4;
        chargeTime5 = BATTERY_KW / chargePow5;

        //round numbers
        chargePow1 = Math.round(chargePow1 * scale) / scale;
        chargePow2 = Math.round(chargePow2 * scale) / scale;
        chargePow3 = Math.round(chargePow3 * scale) / scale;
        chargePow4 = Math.round(chargePow4 * scale) / scale;
        chargePow5 = Math.round(chargePow5 * scale) / scale;
        chargeTime1 = Math.round(chargeTime1 * scale) / scale;
        chargeTime2 = Math.round(chargeTime2 * scale) / scale;
        chargeTime3 = Math.round(chargeTime3 * scale) / scale;
        chargeTime4 = Math.round(chargeTime4 * scale) / scale;
        chargeTime5 = Math.round(chargeTime5 * scale) / scale;

        //print formatted table
        System.out.println("Battery: " + BATTERY_KW + "(KWH)");
        System.out.printf("%-15s %-15s %-15s %-15s %n", "Current(A) ", "Voltage(V) ", "Charging Power(kw) ", "Charging Time(h) ");
        System.out.printf("%-15.1f %-15.1f %-19.1f %-15.2f %n", A10, V230, chargePow1, chargeTime1);
        System.out.printf("%-15.1f %-15.1f %-19.2f %-15.2f %n", A16, V230, chargePow2, chargeTime2);
        System.out.printf("%-15.1f %-15.1f %-19.2f %-15.2f %n", A10, V400, chargePow3, chargeTime3);
        System.out.printf("%-15.1f %-15.1f %-19.2f %-15.2f %n", A16, V400, chargePow4, chargeTime4);
        System.out.printf("%-15.1f %-15.1f %-19.2f %-15.2f %n", A32, V400, chargePow5, chargeTime5);
    }
}


