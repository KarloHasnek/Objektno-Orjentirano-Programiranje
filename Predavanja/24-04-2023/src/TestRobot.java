import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestRobot {
    
    public static void main(String[] args) {

        ArrayList<Robot> robots = generateListOfRobots(6);
        System.out.println(robots);
        Collections.sort(robots);
        System.out.println(robots);
        Collections.reverse(robots);
        System.out.println("reverse order:\n" + robots);
        changeStatus(robots);
        Collections.sort(robots, new RobotBatteryComparator());
        System.out.println("Sort by battery level:\n" + robots);

    }

    private static ArrayList<Robot> generateListOfRobots(int numRobots) {
        
        ArrayList<Robot> robots = new ArrayList<>(numRobots);
        for (int i = 0; i < numRobots; i++) {
            robots.add(new Robot());
        }

        return robots;
    }

    private static void changeStatus(ArrayList<Robot> robots) {
        
        for (Robot robot : robots) {
            robot.setStatus(true);
            robot.discharge();
        }
    }

    static class RobotBatteryComparator implements Comparator<Robot> {

        @Override
        public int compare(Robot o1, Robot o2) {

            if (o1.getBatteryLevel() > o2.getBatteryLevel()) {
                return 1;
            } else if (o1.getBatteryLevel() < o2.getBatteryLevel()) {
                return -1;
            }else return 0;
        }
        
    }
}
