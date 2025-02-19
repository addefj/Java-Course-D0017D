import java.lang.Math;
public class RandomNumbersAddition {
    public static void main(String[] args){

        // define the range
        int max = 10;
        int min = 1;
        int range = 0;
        int randFirstDice = 0;
        int randSecondDice = 0;
        int randThirdDice = 0;
        int sum = 0;

        range = max - min + 1;

// generate random numbers within min(1) to max(10)
        randFirstDice = (int)(Math.random() * range) + min;
        System.out.print(randFirstDice + " ");
        randSecondDice = (int)(Math.random() * range) + min;
        System.out.print(randSecondDice + " ");
        randThirdDice = (int)(Math.random() * range) + min;
        System.out.println(randThirdDice);

        sum = randFirstDice + randSecondDice + randThirdDice;
        System.out.println(sum);

// Output is different everytime this code is executed

    }
}
