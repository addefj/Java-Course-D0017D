import java.util.Random;
import java.util.Scanner;

/**
 * The program is a game where the player will roll 3 dice to get a total sum of 12 in order to win.
 *
 * 1.welcoming message
 * 2.Ask user to chose dice
 * 3.Check if user entry is valid, quit if command is entered, return if invalid, or continue
 * 4.Check which dice was rolled and randomize roll
 * 5.Update counters
 * 6.Check if all dices were rolled, if so check if user won, lost or played even. Start a new round
 * 7.If not all dices were rolled, go back to step 2.
 *
 * @author Name Andreas Fjällid (LTU username)
 */
public class DiceBoxGame {
    /**
     * Below static strings are there to help you get the messages correct.
     * Autograder checks for these exact strings, so it is mentioned here.
     * You can rename them if you want, and you can directly use them in your code.
     * Just make sure these exact messages are used.
     */
    static final String GAME_START = "Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...\n";
    static final String CHOOSE_DICE = "Enter which dice you want to roll [1,2,3] (exit with q):";
    static final String ROUND_WON = "You won!!";
    static final String ROUND_LOST = "You lost!!";
    static final String ROUND_TIE = "You neither won nor lost the round.";
    static final String NEXT_ROUND = "\nNext round!\n";
    static final String GAME_OVER = "Game Over!";
    static final String ALREADY_SELECTED_DICE = "Sorry, you have already rolled that dice. Try again";
    static final String INVALID_ENTRY = "Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q\n";
    static final String AMOUNT_WIN_STRING = "#win: ";
    static final String AMOUNT_LOST_STRING = " #loss: ";
    static final String SUM_STRING = " sum: ";
    static final int MAX_DICE_VALUE = 6;
    static final int MIN_DICE_VALUE = 1;
    static final int DICE_SUM_TARGET_VALUE = 12;
    static final int FIRST_DICE = 1;
    static final int SECOND_DICE = 2;
    static final int THIRD_DICE = 3;
    static final String QUIT = "q";

    public static void main(final String[] args) {

        int dice1Value = 0; // The value of the first dice
        boolean isDice1Rolled = false; // Whether the first dice is rolled or not

        int dice2Value = 0; // The value of the second dice
        boolean isDice2Rolled = false; // Whether the second dice is rolled or not

        int dice3Value = 0; // The value of the third dice
        boolean isDice3Rolled = false; // Whether the third dice is rolled or not

        int sum = 0; // The sum of the dice values
        int winCounter = 0; // The number of wins
        int lossCounter = 0; // The number of losses
        int diceChosen = 0; // The dice user choose
        int numberOfRolls = 0; // Keeps track of number of dice rolls
        String inputString = ""; // To compare with Exit value

        boolean isPlaying = true; // Whether the game is being played or not

        Scanner userInput = new Scanner(System.in); // Create scanner
        Random rand = new Random(); // Create random gen

        System.out.println(GAME_START); //Welcoming message

        while (isPlaying) {
            System.out.println(CHOOSE_DICE); //Game instruction

            if (userInput.hasNextInt()) { //check if user entered a number
                diceChosen = userInput.nextInt();
                if (diceChosen < FIRST_DICE || diceChosen > THIRD_DICE) { //if numbers not in valid range, error message
                    System.out.println(INVALID_ENTRY); //Error message, try again.
                    continue; //Go back to start
                }
            } else {
                inputString = userInput.next();
                if (inputString.equalsIgnoreCase(QUIT)) { //if user entered q, quit and print stats and Game over
                    System.out.println(AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
                    System.out.println(GAME_OVER);
                    isPlaying = false; //set condition to false to exit loop
                    continue; //Go back to start
                } else {
                    System.out.println(INVALID_ENTRY); //if user entered invalid string, print error message and return
                    continue; //Go back to start
                }
            }
            if (diceChosen == 1 && numberOfRolls < 3) { //check if first dice was rolled
                if (isDice1Rolled) { //check if first dice was rolled this round already
                    System.out.println(ALREADY_SELECTED_DICE);
                    continue; //Go back to start
                } else {
                    rand = new Random(); //create random number
                    dice1Value = rand.nextInt(MAX_DICE_VALUE);
                    dice1Value++;
                    sum += dice1Value;
                    isDice1Rolled = true;
                    numberOfRolls++;
                }
            } else if (diceChosen == 2 && numberOfRolls < 3) { //check if second dice was rolled
                if (isDice2Rolled) { //check if second dice was rolled this round already
                    System.out.println(ALREADY_SELECTED_DICE);
                    continue; //Go back to start
                } else {
                    rand = new Random(); //create random number
                    dice2Value = rand.nextInt(MAX_DICE_VALUE);
                    dice2Value++;
                    sum += dice2Value;
                    isDice2Rolled = true;
                    numberOfRolls++;
                }
            } else if (diceChosen == 3 && numberOfRolls < 3) { //check if third dice was rolled
                if (isDice3Rolled) { //check if third dice was rolled this round already
                    System.out.println(ALREADY_SELECTED_DICE);
                    continue; //Go back to start
                } else {
                    rand = new Random(); //create random number
                    dice3Value = rand.nextInt(MAX_DICE_VALUE);
                    dice3Value++;
                    sum += dice3Value;
                    isDice3Rolled = true;
                    numberOfRolls++;
                }
            }
            if (numberOfRolls == 3) { //check if all dices were rolled to enter round summary
                if (sum < DICE_SUM_TARGET_VALUE) { //condition for tie result
                    System.out.println(dice1Value + " " + dice2Value + " " + dice3Value
                            + " " + " sum: " + sum + " " + AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
                    System.out.println(ROUND_TIE);
                    System.out.println(NEXT_ROUND);
                    sum = 0;
                    numberOfRolls = 0;
                    isDice1Rolled = false;
                    isDice2Rolled = false;
                    isDice3Rolled = false;
                    dice1Value = 0;
                    dice2Value = 0;
                    dice3Value = 0;
                } else if (sum > DICE_SUM_TARGET_VALUE) { //condition for loss result
                    lossCounter++;
                    System.out.println(dice1Value + " " + dice2Value + " " + dice3Value
                            + " " + " sum: " + sum + " " + AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
                    System.out.println(ROUND_LOST);
                    System.out.println(NEXT_ROUND);
                    sum = 0;
                    numberOfRolls = 0;
                    isDice1Rolled = false;
                    isDice2Rolled = false;
                    isDice3Rolled = false;
                    dice1Value = 0;
                    dice2Value = 0;
                    dice3Value = 0;
                } else { //win result
                    winCounter++;
                    System.out.println(dice1Value + " " + dice2Value + " " + dice3Value
                            + " " + " sum: " + sum + " " + AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
                    System.out.println(ROUND_WON);
                    System.out.println(NEXT_ROUND);
                    sum = 0;
                    numberOfRolls = 0;
                    isDice1Rolled = false;
                    isDice2Rolled = false;
                    isDice3Rolled = false;
                    dice1Value = 0;
                    dice2Value = 0;
                    dice3Value = 0;
                }
            } else { //print result after each rolled dice
                System.out.println(dice1Value + " " + dice2Value + " " + dice3Value
                        + " " + " sum: " + sum + " " + AMOUNT_WIN_STRING + winCounter + AMOUNT_LOST_STRING + lossCounter);
            }
        }
        userInput.close();
    }
}