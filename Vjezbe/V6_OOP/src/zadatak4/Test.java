package zadatak4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

        // ZAKLJUCAK:
        // Dodavanjem @Override equals() i hashCode() metoda u klasu Robot
        // izbegava se dodavanje duplikata u kolekcije

    public static void main(String[] args) {

        // Creating 5 robots
        Robot robot1 = new Robot(82,"Flying robot");
        Robot robot2 = new Robot(64,"Walking robot");
        Robot robot3 = new Robot(45,"Talking robot");
        Robot robot4 = new Robot(17,"Singing robot");
        Robot robot5 = new Robot(79,"Dancing robot");

        // Creating LinkedHashSet and LinkedHashMap
        LinkedHashSet<Robot> lhs = new LinkedHashSet<>();
        lhs.add(robot1);
        lhs.add(robot2);
        lhs.add(robot3);
        lhs.add(robot4);
        lhs.add(robot5);

        LinkedHashMap<Integer, Robot> lhm = new LinkedHashMap<>();
        lhm.put(robot1.getId(), robot1);
        lhm.put(robot2.getId(), robot2);
        lhm.put(robot3.getId(), robot3);
        lhm.put(robot4.getId(), robot4);
        lhm.put(robot5.getId(), robot5);

        // Adding repeating robot to both collections
        lhs.add(new Robot(82,"Flying robot"));
        lhm.put(82, new Robot(82,"Flying robot"));

        // Printing LinkedHashSet and LinkedHashMap
        AUXCLS.printSet(lhs);
        AUXCLS.printMap(lhm);
    }


}
