package zadatak4;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    private static final int LOW = 1;
    private static final int UPP = 120;

    public static int genAge2Guess(){
        return ThreadLocalRandom.current().nextInt(LOW, UPP);
    }
}
