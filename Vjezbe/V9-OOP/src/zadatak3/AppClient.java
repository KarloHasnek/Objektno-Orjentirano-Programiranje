package zadatak3;

import zadatak2.CsvHandling;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AppClient {

    public static void main(String[] args) {

        String pathBin = "src/zadatak3/spaceScientists.bin";
        String pathCSV = "src/zadatak3/spaceScientists.csv";

        ArrayList<SpaceScientist> scientists = new ArrayList<>();
        SpaceScientist scientist1 = new SpaceScientist("Scientist-01", "Swordsmanship", generateArrayOfEquipment());
        SpaceScientist scientist2 = new SpaceScientist("Scientist-02", "Brewing", generateArrayOfEquipment());
        SpaceScientist scientist3 = new SpaceScientist("Scientist-03", "Chemistry", generateArrayOfEquipment());
        scientists.add(scientist1);
        scientists.add(scientist2);
        scientists.add(scientist3);

        ObjectsHandling3.saveObj2File(pathBin, scientists);
        ObjectsHandling3.read4File(pathBin);

        ObjectsHandling3.writeIntoTxt(pathCSV, scientists);
        ObjectsHandling3.read4CSVFile(pathCSV);

        //ObjectsHandling3.listAllData4File(ObjectsHandling3.read4File(pathCSV));
    }

    private static ArrayList<String> generateArrayOfEquipment() {
        String[] equipmentList = {"Bottle", "Glasses", "Lightsaber", "Acid", "Microscope", "Monocle", "Gas", "Water"};

        ArrayList<String> equipment = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            equipment.add(equipmentList[ThreadLocalRandom.current().nextInt(equipmentList.length)]);
        }

        return equipment;
    }
}
