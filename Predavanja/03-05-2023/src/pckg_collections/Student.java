package pckg_collections;

import java.util.concurrent.ThreadLocalRandom;

public class Student implements Comparable<Student>{
    
    private String name;
    private int id;
    private static int cntID = 100;
    private int yearsOnStudy;
    private static final int MINY = 1;
    private static final int MAXY = 7;

    public Student(String name) {
        this.name = name;
        this.id = cntID++;
        this.yearsOnStudy = ThreadLocalRandom.current().nextInt(MINY, MAXY+1);
    }

    public int getYearsOnStudy() {
        return yearsOnStudy;
    }

    @Override
    public int compareTo(Student student2) {
        if (this.yearsOnStudy > student2.getYearsOnStudy()){
            return 1;
        } else if (this.yearsOnStudy < student2.getYearsOnStudy()) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", yearsOnStudy=" + yearsOnStudy + "]";
    }

    

    
}
