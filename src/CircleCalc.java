import java.lang.Math;
public class CircleCalc {
    public static void main(String[] args){

        //declare constants
        final float PI = 3.1415f;

        //declare variables
        float randRadius = 0;
        float area = 0;

        //get a random radius number
        randRadius = (float)(Math.random() * 9) + 1;

        //calculate area
        area = randRadius * randRadius * PI;

        //print radius and area on seperate lines
        System.out.println("The area is " + area);
        System.out.println("The radius is " + randRadius);


    }
}
