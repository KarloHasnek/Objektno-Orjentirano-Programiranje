package zadatak4;

import java.util.Scanner;

public class Game {

    private static int age2Guess;
    private static int cnt;
    private static boolean gameCont;

    public static void runGame() {

        Scanner sc = new Scanner(System.in);

        gameCont = true;
        age2Guess = Generator.genAge2Guess();
        UserInputs userInputs = userInputs();

        while (gameCont) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            boolean bool = guessStatus(userInputs, guess);
            if (!bool) {
                gameCont = false;
                contGame(bool);
            }
            cnt++;
        }
        System.out.println("You guessed it!");
        System.out.println("Number of tries: " + cnt);
    }

    private static UserInputs userInputs() {
        UserInputs userInputs = new UserInputs();
        isInputNegative(userInputs.getLwr());
        isInputNegative(userInputs.getUpper());
        isInputNegative(userInputs.getGuess());
        return userInputs;
    }

    private static void isInputNegative(int input) {
        if (input < 0) {
            new UserInputException("Given input " + input + " is not valid! try again!");
        }
    }

    private static void contGame(boolean continueGame) {
        if (!continueGame) {
            gameCont = false;
        }
    }

    private static boolean guessStatus(UserInputs userInputs, int n) {

        boolean status = true;

        if (n == userInputs.getGuess()) {
            status = false;
        }


        return status;
    }
}
