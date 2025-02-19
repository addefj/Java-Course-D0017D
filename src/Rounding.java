import java.lang.Math;
public class Rounding {
    public static void main(final String[] args)
        {

            /**
             * Program for rounding to x number of decimals
             *
             * 1. Move decimal point to desired number of value digits (multiply by 10 ^ x)
             * 2. Round to integers
             * 3. Move back decimal point (divide by 10 ^ x)
             */
            double value = Math.PI;
            int noOfDecimals = 4;
            System.out.println(value);
            double scale = 0;
            double newValue = 0;
            scale = Math.pow (10, noOfDecimals);
            newValue = Math.round (value * scale) / scale;
            System.out.print(newValue);
        }
}
