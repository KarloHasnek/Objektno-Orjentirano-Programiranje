package zadatak6.model;


import java.util.Objects;

public class User implements Comparable<User> {

    private String username;
    private String mail;
    private int id;

    public User(String username, String mail, int id) {
        this.username = username;
        this.mail = mail;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", mail='" + mail + '\'' + ", id=" + id + '}';
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.id, o.id);
    }
}
