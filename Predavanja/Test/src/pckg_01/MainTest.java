package pckg_01;
public class MainTest {

    public static void main(String[] args) {

        Person person = new Person("Karlo", 21);
        System.out.println(person);
        testPersonAsReference(person, "Bndrijb");
        System.out.println(person);
    }

    private static void testPersonAsReference(Person person, String newName){
        System.out.println("Changing person name: ");
        person.setName(newName);
    }
    
}