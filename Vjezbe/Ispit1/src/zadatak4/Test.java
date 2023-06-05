package zadatak4;

public class Test {

    public static void main(String[] args) {
        String file = "src/zadatak4/worldcup.txt";

        WorldCup worldcup1 = new WorldCup();

        worldcup1.worldCupInYear(6);
        worldcup1.save2File(file);
        worldcup1.worldCupInYear(5);
        worldcup1.save2File(file);

        worldcup1.readFromFile(file);
    }
}

