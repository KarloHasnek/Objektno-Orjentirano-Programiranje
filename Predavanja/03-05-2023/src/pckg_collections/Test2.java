package pckg_collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test2 {
    
    public static void main(String[] args) {

        Integer[] someArr = new Integer[5];
        someArr[0] = 35;
        someArr[1] = 10;
        someArr[2] = 10;
        someArr[3] = 30;
        someArr[4] = 250;

        List<Integer> listInts = Arrays.asList(someArr);
        System.out.println(listInts);

        // Sortira listu i izbacuje duplicirane elemente
        TreeSet<Integer> tSet = new TreeSet<>(listInts);
        System.out.println(tSet);

        tSet.add(33);
        System.out.println(tSet);

        TreeSet<Student> students = new TreeSet<>();
        Student s1Student = new Student("Student-01");
        Student s2Student = new Student("Student-02");
        Student s3Student = new Student("Student-03");
        Student s4Student = new Student("Student-04");
        
        students.add(s1Student);
        students.add(s2Student);
        students.add(s3Student);
        students.add(s4Student);
        System.out.println(students);
    }
}
