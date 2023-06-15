package zadatak2;

public class Calculation {

    private float kredit;
    private float kamata;
    private boolean nacin;
    private int godina;
    private double total;

    public Calculation(float kredit, float kamata, int godina, boolean nacin) {
        this.kredit = kredit;
        this.kamata = kamata;
        this.godina = godina;
        this.nacin = nacin;

        this.total = calculate(this.kredit, this.kamata, this.godina, this.nacin);
    }

    public static double calculate(float kredit, float kamata, int godina, boolean nacin){
        double total;
        int nacinInt;

        if (nacin){
            nacinInt = 12;
        } else nacinInt = 4;

        float intr = (kamata / 100) / nacinInt;
        int n = godina*12;

        double D = (Math.pow((1+intr), n)-1) / (intr*Math.pow((1+intr),n));
        total = kredit / D;

        return total;
    }

    @Override
    public String toString() {
        return "visina kredia -> " + kredit + "\nkamatna stopa -> " + kamata*0.01 + "\ngodina otplate -> " + godina + "\nrata kredita ->" + total;
    }
}
