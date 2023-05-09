package zadatak1;
public class PDS_Student extends Student{

    public PDS_Student(String name) {
        this.name = name;
        this.idStudent = cntStudents++;
    }

    @Override
    protected void completedStudy(int yearOfStudy) {
        System.out.println(this.getClass().getSimpleName() + " is currently on "+ yearOfStudy +". year of study.");
    }
    
}
