package models;

import controllers.AUXCLS;

import java.io.*;

public class PasswordsHandler {

    /**
     * This method is used to save instance of class Passwords to .bin file
     * @param passwords instance of Passwords class.
     */
    public static void addToBin(Passwords passwords) {
        File file = new File(AUXCLS.BIN_FILE_PATH);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(passwords);
            System.out.println("Class passwords was successfully written to the file.");
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Passwords readFromBin() {
        System.out.println("Reading class passwords from the file.");
        File file = new File(AUXCLS.BIN_FILE_PATH);
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Passwords passwords = (Passwords) ois.readObject();
            ois.close();
            System.out.println("Class passwords was successfully read from the file.");
            return passwords;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
