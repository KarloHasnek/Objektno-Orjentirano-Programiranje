import java.util.Random;

public class RandomDirection {
    
    private final String[] DIRECTIONS = {"North", "East", "South", "West"};
    private double MIN = 0;
    private double MAX = 100;
    private Random random;

    RandomDirection(){
        genRandDirectionData();
    }

    private void genRandDirectionData(){
        int directionNum = random.nextInt(4);
        String direction = DIRECTIONS[directionNum];

        double speed = random.nextDouble(MIN, MAX);
    }
}
