package pckg_01;

public class User {
    
    //Atributi
    private String userName;
    private String describeUser;
    private int id;
    private static int cntID = 10;

    //Konstruktor
    public User(String name, String desc) {
        this.userName = name;
        this.describeUser = desc;
        this.id = cntID;
        cntID++;

    }

    public User() {
    }

    //Metode
    public void instantMessageFromUser(String msg) {
        System.out.println("This is a message: ");
        System.out.println(msg);
    }


    //Generirani Override od Object.tostring()
    @Override
    public String toString() {
        return "User{" +
            "userName='" + userName + "'" +
            ", describeUser='" + describeUser + "'" +
            ", id='" + id + "'" +
            "}";
    }

}
