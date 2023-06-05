package zadatak3;

public class User {

    private String name;
    private int id;
    private static int cntID;

    public User(String name) {
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + ", id=" + id + '}';
    }
}
