import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    private String mail;
    private int id;
    private static int cnt = 100;

    public User(String userName, String mail){
        // dopuniti
        this.userName = userName;
        this.mail = mail;
        this.id = cnt;
        cnt += 10;
    }

    // getters za id
    public int getId() {
        return id;
    }


    public void info(){
        System.out.println(toString());
    }


        // generirajte toString
        @java.lang.Override
        public java.lang.String toString() {
            return "User{" + "userName='" + userName + ", mail='" + mail + '\'' + ", id=" + id + '}';
        }
}