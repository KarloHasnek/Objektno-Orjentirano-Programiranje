package zadatak3;

import zadatak1.Gunslinger;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ObjectsHandling3 {

    // SAVE and READ objects -> .bin
    public static <T> void saveObj2File(String fullPath, List<T> objcts) {

        File file = new File(fullPath);

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objcts);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> read4File(String fullPath) {

        File file = new File(fullPath);
        ArrayList<T> objects = new ArrayList<>();

        try(FileInputStream fis = new FileInputStream(file)) {

            ObjectInputStream ois = new ObjectInputStream(fis);

            T ob = (T) ois.readObject();
            System.out.println(ob.toString());
            System.out.println(ob.getClass().getCanonicalName());
            objects.addAll((Collection<? extends T>) ob);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        for (T object : objects) {
            System.out.println(object.toString());
        }
        return objects;
    }

    // SAVE, READ and LIST objects -> .csv
    public static void writeIntoTxt(String filePath, ArrayList<SpaceScientist> dta) {

        File file = new File(filePath);
        try(FileWriter fw = new FileWriter(filePath)){

            BufferedWriter bw = new BufferedWriter(fw);

            for (SpaceScientist object : dta) {

                bw.flush();
                bw.write(object.getName());
                bw.write(", ");
                bw.write(Integer.toString(object.getId()));
                bw.write(", ");
                bw.write(object.getSpecialization());
                bw.write(", ");
                ArrayList<String> equipment = object.getEquipment();
                bw.write(Arrays.toString(equipment.toArray()));
                bw.write(", ");
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
