package zadatak4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        // Inicijalizacija
        String fileName = "src/zadatak4/data.txt";
        LinkedList<String> list = new LinkedList<>();
        File file = new File(fileName);

        // Čitanje datoteke
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        // Ispis sadržaja liste
        System.out.println("----------------------------------");
        System.out.println("List content:");
        for (String line : list) {
            System.out.println(line);
        }

        // Ispis sadržaja liste sortiranu po duljini linije
        System.out.println("----------------------------------");
        System.out.println("List content sorted by line length:");
        list.sort(Comparator.comparingInt(String::length));
        for (String line : list) {
            System.out.println(line);
        }
        System.out.println("----------------------------------");

    }
}
