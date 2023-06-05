import java.util.Arrays;

public class Student {

    private int student_id;
    private String stud_name;
    private String university;
    private String[] courses;


    public Student(int student_id, String stud_name, String university, String[] courses) {
        this.student_id = student_id;
        this.stud_name = stud_name;
        this.university = university;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", stud_name='" + stud_name + '\'' +
                ", university='" + university + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
