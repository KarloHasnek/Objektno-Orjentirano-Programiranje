package pckg_01;

public class TestApp {
    
    public static void main(String[] args) {

        User usr = new User("USER-01", "Simple user");
        User usr2 = new User("USER-02", "Simple user 2");
        usr.instantMessageFromUser("Simple msg...");
        System.out.println(usr);
        System.out.println(usr2);

        SuperUser sup1 = new SuperUser("SUPER-01", "Super user");
        sup1.instantMessageFromUser("Msg from super...");
        System.out.println(sup1);

    }
}