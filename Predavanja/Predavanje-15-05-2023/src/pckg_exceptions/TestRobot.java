package pckg_exceptions;

import java.util.ArrayList;
import java.util.List;

public class TestRobot {

    public static void main(String[] args) {

        List<Robot> robots = new ArrayList<>();
        robots.add(new IndustrialRobot("I-Robot-1"));
        robots.add(new HomeAssistantRobot("HA-Robot-1"));
        robots.add(new IndustrialRobot("I-Robot-2"));
        robots.add(new HomeAssistantRobot("HA-Robot-2"));
    }
}
