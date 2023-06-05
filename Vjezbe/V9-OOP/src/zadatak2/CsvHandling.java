package zadatak2;

import zadatak1.Gunslinger;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvHandling {

    public static void writeIntoTxt(String filePath, ArrayList<Gunslinger> dta) throws IOException {

        File file = new File(filePath);
        try(FileWriter fw = new FileWriter(filePath)){

            BufferedWriter bw = new BufferedWriter(fw);

            for (Gunslinger gunslinger : dta) {

                bw.flush();
                bw.write(gunslinger.getName());
                bw.write(", ");
                int duelsWon = gunslinger.getDuels();
                bw.write(Integer.toString(duelsWon));
                bw.write(", ");
                bw.write(gunslinger.getStrongHand());
                bw.write(", ");
                boolean two = gunslinger.isTwoGuns();
                bw.write(Boolean.toString(two));
                bw.write(", ");
                DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formatedDOB = gunslinger.getDob().format(dobFormatter);
                bw.write(formatedDOB);
                bw.newLine();

            }
            System.out.println("Finished writting into the file -> " + file.getPath());
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> read4CSVFile(String fullPath) {

        List<String[]> data = new ArrayList<String[]>();
        File file = new File(fullPath);
        String[] rowData;
        String lnRow;

        try (FileReader fr = new FileReader(file)) {

            BufferedReader br = new BufferedReader(fr);
            while ((lnRow = br.readLine()) != null) {
                rowData = lnRow.split("\\s*,\\s*");
                data.add(rowData);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static void listAllData4File(List<String[]> data) {

        for (String[] strings : data) {

            System.out.println(Arrays.toString(strings));
        }
    }
}
