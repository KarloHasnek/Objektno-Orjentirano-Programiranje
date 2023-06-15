package ostalo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public String filePath = "src/data.csv";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter file path: ");
            String filePath = sc.nextLine();
            try {
                AUX_CLS.readDataFromCSV(filePath);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }

        AUX_CLS.printStudents();

    }
}
