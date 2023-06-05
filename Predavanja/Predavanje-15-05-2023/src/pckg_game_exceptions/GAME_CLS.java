package pckg_game_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GAME_CLS {

    public static void playGame(Scanner scanner, String filePath) {
        Set<Integer> nums = readDataToSetStructure(filePath, scanner);
        scanner = new Scanner(System.in);
        int numToGuess = getRandomFromDataStructure(nums);
        System.out.println("Please enter your guess for age");
        String guessStrType = scanner.nextLine();
        try {
            int guess = Integer.parseInt(guessStrType);
            if (guess == numToGuess) {
                System.out.println("YOU GUESSED CORRECTLY!!!");
            } else {
                System.out.println("Your guess: " + guess + " | number to guess: " + numToGuess);
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong input for integer parsing...");
        }
    }

    public static int getRandomFromDataStructure(Set<Integer> set) {

        int index = ThreadLocalRandom.current().nextInt(0, set.size());

        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        return arr[index];
    }

    public static Set<Integer> readDataToSetStructure(String filePath, Scanner scanner){
        File file = new File(filePath);
        Set<Integer> numbers = new HashSet<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int value = Integer.parseInt(line);
                    numbers.add(value);
                } catch (NumberFormatException nfe) {
                    System.out.println("Not allowed format for integer...");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return numbers;
    }
}
