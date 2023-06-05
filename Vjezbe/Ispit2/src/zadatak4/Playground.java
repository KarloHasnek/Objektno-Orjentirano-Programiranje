package zadatak4;

import java.time.LocalDate;

public abstract class Playground {

    protected int id;
    private static int cntID;
    protected LocalDate date;

    protected Playground(){}

    public abstract void describePlayground();

    protected LocalDate reservationDate(){
        
    }


}
