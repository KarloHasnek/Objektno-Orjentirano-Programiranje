package zadatak2;

import zadatak1.Gunslinger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        String path = "src/zadatak1/gunFighters.csv";

        ArrayList<Gunslinger> gunsSave = new ArrayList<>();
        Gunslinger gn1 = new Gunslinger("Wyatt Earp", "right", true, 1845);
        Gunslinger gn2 = new Gunslinger("Billy the Kid", "left", false, 1830);
        Gunslinger gn3 = new Gunslinger("Wild Bill Hickok", "both", true, 1820);
        gunsSave.add(gn1);
        gunsSave.add(gn2);
        gunsSave.add(gn3);

        CsvHandling.writeIntoTxt(path, gunsSave);
    }
}
