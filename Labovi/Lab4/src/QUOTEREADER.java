// all imports
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class QUOTEREADER {

    public static void main(String[] args) {

        String path = "src/quotes.txt";
        readDataFromFile(path);

    }


    // static field - key:value data structure


    // reads data from file and fills appropriate data structure
    public static void readDataFromFile(String filePath)  {
        ArrayList<String> text = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    text.add(line);
                }
                System.out.println("File read successfully.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
    }

    // getters for static field


    // list all quotes
    public static void listAllQuotes(){

    }
}

