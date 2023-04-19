package pckg_01;

public class SuperUser extends User {

    public SuperUser(String name, String desc) {
        super(name, desc);
    }
    

    @Override
    public void instantMessageFromUser(String msg) {
        System.out.println("Always is super!!!");
    }    
}
