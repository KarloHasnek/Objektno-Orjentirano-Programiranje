package zadatak4;

import java.util.Scanner;

public class UserInputs {

    private int lwr;
    private int upper;
    private int guess;
    private boolean status;
    private static Scanner sc = new Scanner(System.in);

    public UserInputs() {
        while (true) {
            try {
                System.out.println("Unesi donju granicu: ");
                this.lwr = sc.nextInt();
                sc.nextLine();
                System.out.println("Unesi gornju granicu: ");
                this.upper = sc.nextInt();
                sc.nextLine();
                System.out.println("Unesi traženu godinu: ");
                this.guess = sc.nextInt();
                setStatus(true);
                break;
            } catch (Exception e) {
                System.out.println("Unos nije tocan probajte ponovno...");
                sc.nextLine();
            }
        }
    }

    public void setInputs(int input1, int input2, int input3) {
        this.lwr = input1;
        this.upper = input2;
        this.guess = input3;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getLwr() {
        return lwr;
    }

    public int getUpper() {
        return upper;
    }

    public int getGuess() {
        return guess;
    }

    public boolean isStatus() {
        return status;
    }
}
