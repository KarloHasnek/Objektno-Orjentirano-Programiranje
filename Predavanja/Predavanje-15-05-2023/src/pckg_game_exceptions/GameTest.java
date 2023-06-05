package pckg_game_exceptions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameTest {

    private static Scanner scanner;

    public static void main(String[] args) {
        String filePath = "src/pckg_game_exceptions/ageData.txt";
//        Set<Integer> numbers = new HashSet<>();
//        numbers = GAME_CLS.readDataToSetStructure(filePath, scanner);
//        System.out.println(numbers);
//        int randVal = GAME_CLS.getRandomFromDataStructure(numbers);
//        System.out.println(randVal);
        GAME_CLS.playGame(scanner, filePath);
    }
}
