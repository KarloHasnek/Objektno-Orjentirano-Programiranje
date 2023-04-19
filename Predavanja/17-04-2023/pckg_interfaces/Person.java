package pckg_interfaces;

public abstract class Person {
    
    protected String name;
    protected String occupation;
    protected int age;

    protected Person(String name, String occ, int age) {
        this.name = name;
        this.occupation = occ;
        this.age = age;
    }

    protected abstract void provideExplanation();

    protected void takeTaxi(){
        System.out.println(getClass().getSimpleName() + "can take taxi for a ride...");
    }
}
