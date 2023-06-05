package zadatak4;

public class UserInputException extends Exception {

    private int lwr; // donja granica
    private int uppr; // gornja granica
    private int plGuess; // vrijednost koju igrac unese za godine
    private String msg; // Poruka o iznimci -> mogu biti razlicite

    public UserInputException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void setLower(int val) {
        lwr = val;
        System.out.println("You entered: <" + lwr + "> for the lower age bound!!!");
    }

    public void setUppr(int val) {
        lwr = val;
        System.out.println("You entered: <" + uppr + "> for the lower age bound!!!");
    }

    public void setPlGuess(int val) {
        lwr = val;
        System.out.println("You entered: <" + plGuess + "> for the lower age bound!!!");
    }

}
