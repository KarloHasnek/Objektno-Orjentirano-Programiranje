package zadatak1;

public class Client {

    public static void main(String[] args) {
        Semafor semafor = new Semafor();
        Haker haker = new Haker(semafor);
        int probni = 2;
        semafor.stanje(probni);
        haker.manualProgrammingSemafor();
    }
}
