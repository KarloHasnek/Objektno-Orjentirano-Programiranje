package zadatak1zadatak2;

public class Robot {
    
    //Atributi
    private int ID;
    private String name;
    private int[][] niz = new int[5][4];
    private int i = 0;
    private int j = 0;


    //Getters i Setters
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Ostale Metode
    public void walk() {
        System.out.println("I roboti znaju hodati...");
    }

    public void factJel(int prirodniBroj) {
        System.out.println("Calculating...beep, boop....");
        int rezultat = 1;
        for (int i = 1; i <= prirodniBroj; i++) {
            rezultat *= i;
        }
        System.out.println("Iznos faktorijele broja " + prirodniBroj + " iznosi: ");
        System.out.println(rezultat);
    }
    
    public int[][] fillArr(int userInput) {

        niz[i][j] = userInput;
        if (j <= niz[i].length) {
            j++;
        } else{
            j = 0;
            if (i <= niz.length) {
                i++;
            }
        }
        return niz;
    }
}
