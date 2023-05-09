package zadatak1;

public class Semafor {
    
    // Atributi
    private static String crveno = "0";
    private static String zeleno = "1";
    private static String zuto = "2";
    
    // Getters i Setters
    public String getCrveno() {
        return crveno;
    }
    public void setCrveno(String crveno) {
        Semafor.crveno = crveno;
    }
    public String getZeleno() {
        return zeleno;
    }
    public void setZeleno(String zeleno) {
        Semafor.zeleno = zeleno;
    }
    public String getZuto() {
        return zuto;
    }
    public void setZuto(String zuto) {
        Semafor.zuto = zuto;
    }
    
    // Metode
    public void stanje(int num) {
        String stanje = String.valueOf(num);
        
        if (stanje.equals(crveno)) {
            System.out.println("Na semaforu je prikazano crveno svijetlo.");
            System.out.println("Zaustavite vozilo.");
        } else if (stanje.equals(zeleno)) {
            System.out.println("Na semaforu je prikazano zeleno svijetlo.");
            System.out.println("Pokrenite vozilo.");
        } else if (stanje.equals(zuto)) {
            System.out.println("Na semaforu je prikazano zuto svijetlo.");
            System.out.println("Pripremite vozilo.");
        } else {
            System.out.println("Zadana vrijednost nije poznata. Molimo pokusajte ponovno.");
        }
    }
}
