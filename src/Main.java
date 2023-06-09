import java.util.Random;
import java.util.Scanner;
class NumberguessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);

        int tryCount = 0;
        while(true) {
            System.out.println("Guess a number between 1 to 100:");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("yuppp ! you just won");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if(randomNumber > playerGuess) {
                System.out.println(" The number is higher than your guess. Guess again.");
            }
            else {
                System.out.println("The number is lower than your guess. Guess again.");
            }
        }
        scanner.close();
        System.out.println("Your score is "+((11-tryCount)*10)+" out of 100");


    }
}