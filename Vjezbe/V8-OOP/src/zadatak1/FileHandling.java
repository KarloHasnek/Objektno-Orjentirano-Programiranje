package zadatak1;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void readFileWithScanner(String fileName) {
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void readFileWithBufferedReader(String fileName){

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while(true) {
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
    }

    public static void write2File(String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Hello World!\n");
            bw.append("Appended sequence\n");
            bw.flush();
            bw.close();
            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println("Failed to write to file.");
        }
    }

    public static void askUser4File() {

        Scanner sc = new Scanner(System.in);
        String fileName;

        while(true) {
            System.out.print("Enter file name (or exit to quit) -> ");
            String userInput = sc.nextLine();
            if (userInput.equals("exit")) {
                break;
            } else {
                fileName = "src/zadatak1/" + userInput;
                readFileWithScanner(fileName);
            }
        }

        sc.close();

    }
}