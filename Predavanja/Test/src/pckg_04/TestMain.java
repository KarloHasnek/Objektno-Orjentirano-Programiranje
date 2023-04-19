package pckg_04;

import pckg_03.AUX01;
import pckg_03.Person;
import pckg_03.Student;

public class TestMain {
    public static void main(String[] args) {
        AUX01.sumFirstNInt2(12);

        Person prs1 = new Person("Juraj", 22);
        Student s2 = new Student("Jurica", 18);
        System.out.println(prs1);
        System.out.println(s2);
    }

}
