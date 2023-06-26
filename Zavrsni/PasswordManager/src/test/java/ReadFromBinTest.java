import models.Passwords;
import models.PasswordsHandler;

public class ReadFromBinTest {

    static Passwords passwords;

    public static void main(String[] args) {
        passwords = PasswordsHandler.readFromBin();
        System.out.println(passwords);
    }
}
