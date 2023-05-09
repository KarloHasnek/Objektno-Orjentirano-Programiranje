package zadatak1;
public class DS_Student extends Student{

    public DS_Student(String name) {
        this.name = name;
        this.idStudent = cntStudents++;
    }

    @Override
    protected void completedStudy(int yearOfStudy) {
        System.out.println(this.getClass().getSimpleName() + " is currently on "+ yearOfStudy +". year of study.");
    }
    
}
