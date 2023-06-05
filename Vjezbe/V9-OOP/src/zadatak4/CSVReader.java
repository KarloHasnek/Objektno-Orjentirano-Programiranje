package zadatak4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVReader {

    public static List<String[]> read4CSVFile(String fullPath) {
        List<String[]> data = new ArrayList<>();
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

    public static String[] getColumnData(int col, List<String[]> data4CSV) {

        String[] colData = new String[data4CSV.size()-1]; // do not want headers info
        int cnt  = 0;
        for(String[] row: data4CSV) {

            if(data4CSV.indexOf(row) == 0) {
                continue;
            } else {
                colData[cnt] = row[col];
                cnt++;
            }

        }
        return colData;
    }

    public static Set<String> getUniques(String[] dta){

        Set<String> uniq = new TreeSet<>();
        uniq.addAll(Arrays.asList(dta));

        return uniq;
    }

    public static Map<String, List<String[]>> returnAll4Unique(Set<String> unq, List<String[]> rowDta, int col){

        Map<String, List<String[]>> allDta = new TreeMap<>();
        List<String[]> subDta;

        for (String key : unq) {

            subDta = new ArrayList<>();
            for (String[] strings : rowDta) {

                if(key.equals(strings[col])) {
                    subDta.add(strings);
                }
            }
            allDta.put(key, subDta);
        }
        return allDta;
    }

    public static void listAllData(Map<String, List<String[]>> dta) {

        for(String key : dta.keySet()) {
            System.out.println("-> " + key + ": ");
            for(String[] subdta : dta.get(key)) {
                System.out.println(Arrays.toString(subdta));
            }
            System.out.println("\n");
        }

    }
}
