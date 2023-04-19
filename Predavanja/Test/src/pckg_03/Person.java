package pckg_03;

public class Person {
    
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    protected void tenYearsFromNow() {
        int tenFromNow = age + 10;
        System.out.println("Ten years from now: " + tenFromNow);
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            "}";
    }

}
