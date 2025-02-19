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

import java.util.Locale;

public class DecimalToComma {
    public static void main(String[] args) {

        Locale svenska = new Locale("sv", "SE");
        Locale.setDefault(svenska);
        double testDecimal = 10 / 3.8;
        System.out.printf("Test Decimal in Swedish: %2.2f \n", testDecimal);

    }
}