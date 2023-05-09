package pckg_collections;

import java.util.ArrayList;
import java.util.TreeMap;

public class Test4 {
    
    public static void main(String[] args) {
        
        // Inicijalizacija i definicija ArrayList-e
        TreeMap<Integer, ArrayList<Student>> mapStudents = new TreeMap<Integer, ArrayList<Student>>();
        ArrayList<Student> studentsZero = new ArrayList<>();

        // Generiranje studenata
        Student s1Student = new Student("Student-01");
        Student s2Student = new Student("Student-02");
        Student s3Student = new Student("Student-03");
        Student s4Student = new Student("Student-04");

        // Dodavanje studenata unutar ArrayList
        studentsZero.add(s1Student);
        studentsZero.add(s2Student);
        studentsZero.add(s3Student);
        studentsZero.add(s4Student);

        // Dupliciranje originalne liste Studenata
        ArrayList<Student> student2 = new ArrayList<>(studentsZero);
        ArrayList<Student> student3 = new ArrayList<>(studentsZero);

        // Dodavanje liste sa kljucem unutar mape
        mapStudents.put(10, studentsZero);
        mapStudents.put(20, student2);
        mapStudents.put(1, student3);

        // Implementacija privatnih metoda
        addElementToList(mapStudents, 0, s4Student);
        addElementToList(mapStudents, 1, new Student("Student-05"));
        listElementsFromMap(mapStudents);
    }

    private static void addElementToList(TreeMap<Integer, ArrayList<Student>> mapa, int key, Student student) {
        if (mapa.containsKey(key)) {
            mapa.get(key).add(student);
        } else {
            ArrayList<Student> lst = new ArrayList<>();
            lst.add(student);
            mapa.put(key, lst);
        }
    }

    private static void listElementsFromMap(TreeMap<Integer, ArrayList<Student>> mapa) { 
        for (Integer key : mapa.keySet()) {
            System.out.println("Key: " + key);

            for (Student student : mapa.get(key)) {
                System.out.println("Student: " + student);
            }
            System.out.println("-----------------------------------------------------------");
        }
    }
}
