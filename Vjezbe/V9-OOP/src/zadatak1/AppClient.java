package zadatak1;

import java.util.ArrayList;
import java.util.List;

public class AppClient {

    public static void main(String[] args) {

        String path = "src/zadatak1/gunFighters.bin";

        ArrayList<Gunslinger> gunsSave = new ArrayList<>();
        Gunslinger gn1 = new Gunslinger("Wyatt Earp", "right", true, 1845);
        Gunslinger gn2 = new Gunslinger("Billy the Kid", "left", false, 1830);
        Gunslinger gn3 = new Gunslinger("Wild Bill Hickok", "both", true, 1820);
        gunsSave.add(gn1);
        gunsSave.add(gn2);
        gunsSave.add(gn3);

        ObjectsHandling.saveObj2File(path, gunsSave);
        ObjectsHandling.read4File(path);

    }

}
