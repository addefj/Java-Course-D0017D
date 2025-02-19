import java.lang.Math;
public class Rounding2 {
    public static void main(final String[] args)
        {

            double a = 1.7;
            double b = 1.9;
            double c = a + 0.1;
            double d = b - 0.1;
            double scale = 10;
            double newD = 0;
            newD = Math.round (d * scale) / scale;
            System.out.println (c);
            System.out.println (newD);
        }
}
