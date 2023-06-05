package zadatak4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Country {

    private static String[] cntr = { "France", "Spain", "USA", "Croatia", "Deutsch-land", "Belgium", "Sweden", "Canada",
            "Great Britain", "Russia", "Kongo", "Mexico", "Brazil", "Turkey", "S. Korea", "N. Korea", "Japan", "BiH",
            "Slovenia", "Chile", "Morocco", "New Zealand", "Australia", "Island", "Argentina", "Tunis" };

    public ArrayList<String> getParticipants(int numOfParticipants) {
        ArrayList<String> participants = new ArrayList<>();
        if (numOfParticipants >= cntr.length) {
            participants = new ArrayList<>(Arrays.asList(cntr));
        } else {
            for (int i = 0; i < numOfParticipants; i++) {
                participants.add(i, cntr[ThreadLocalRandom.current().nextInt(0, cntr.length)]);
            }
        }
        return participants;
    }
}
