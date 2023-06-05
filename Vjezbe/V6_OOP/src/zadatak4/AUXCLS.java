package zadatak4;

import java.util.Map;
import java.util.Set;

public class AUXCLS {

    public static void printSet(Set<Robot> set) {
        System.out.println("------------" + set.getClass().getSimpleName() + "------------");
        for (Robot robot : set) {
            System.out.println(robot);
        }
    }

    public static void printMap(Map<Integer, Robot> map) {
        System.out.println("------------" + map.getClass().getSimpleName() + "------------");
        for (Robot robot : map.values()) {
            System.out.println(robot);
        }
    }
}
