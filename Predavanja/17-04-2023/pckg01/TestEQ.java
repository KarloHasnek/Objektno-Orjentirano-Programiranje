package pckg01;

import java.util.Objects;

public class TestEQ {
    
    //main
    public static void main(String[] args) {
        String s1 = "Ovo je string.";
        String s2 = "Ovo je string.";
        Person p1 = new Person("Ivana");
        Person p2 = new Person("Ivana");
        
        //testEquals(s1, s2);
        testEquals(p1, p2);
        testEqualsT(p1, p2);
        testEqualsT(s1, s2);
        p2.setId(100);
        testEqualsT(p1, p2);
    }

    //metoda
    static void testEquals(String s1, String s2){
        System.out.println("S1: " + s1 + "\nS2: " + s2);
        System.out.println("Strings are equal by using operator: " + (s1 == s2));
        System.out.println("Strings are equal by using method: " + s1.equals(s2));
    }

    static void testEquals(Person p1, Person p2){
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Person objects are equal - eq operator: " + (p1==p2));
        System.out.println("Person objects are equal - eq method: " + p1.equals(p2));
    }

    static <T> void testEqualsT(T ep1, T ep2){
        System.out.println("-----------------Java Generics---------------");
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println("Person objects are equal - eq operator: " + (ep1==ep2));
        System.out.println("Person objects are equal - eq method: " + ep1.equals(ep2));
    }

    //klasa
    static class Person{
        String name;
        int id;
        static int cntID = 100;

        public Person(String name){
            this.name = name;
            this.id = cntID++;
        }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    //overrides
    @Override
    public String toString() {
        String desc = getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
        return "Person [name=" + name + ", id=" + id + ", hash=" + desc + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        return true;
    }
        

    
    }
}
