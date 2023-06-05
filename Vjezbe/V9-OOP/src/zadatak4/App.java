package zadatak4;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        String path = "src/zadatak4/data.csv";

        List<String[]> orgDta = CSVReader.read4CSVFile(path);
        String[] colData = CSVReader.getColumnData(0, orgDta);
        Set<String> unique = CSVReader.getUniques(colData);
        Map<String, List<String[]>> data;

        // See if all rows are captured in List structure -> this print is as objects
        System.out.println(orgDta);

        // Print all data from the particular column
        System.out.println("----------------------------------------");
        printAllFromParticularColumn(colData);

        // Print unique elements from the particular column
        System.out.println("----------------------------------------");
        printUniqueFromColumn(unique);

        data = CSVReader.returnAll4Unique(unique, orgDta, 0);
        // List all data for each student
        System.out.println("\n\n"); // make some space
        CSVReader.listAllData(data);
    }

    private static void printAllFromParticularColumn(String[] colData) {
        for (String string : colData) {
            System.out.println(string);
        }
    }

    private static void printUniqueFromColumn(Set<String> unique) {
        for (String string : unique) {
            System.out.println(string);
        }
    }
}