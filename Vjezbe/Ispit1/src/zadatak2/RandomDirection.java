package zadatak2;

import java.util.Random;

public class RandomDirection {

    private static final String[] DIRECTIONS = {"North", "East", "West", "South"};
    private static final double MIN = 1;
    private static final double MAX = 100;
    private Random random;

    public RandomDirection() {

    }

    private void genRandomDirectionData() {
        String direction;
        double speed;

        random = new Random();
        int rndNum = random.nextInt(DIRECTIONS.length);

        direction = DIRECTIONS[rndNum];
        speed = random.nextDouble(MIN, MAX);
    }
}
