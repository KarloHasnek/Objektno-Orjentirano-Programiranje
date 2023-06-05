import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class AUX_CLS {

    private static TreeMap<Integer, Student> students = new TreeMap<>();

    public static void readDataFromCSV(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                int student_id = Integer.parseInt(data[0]);
                String stud_name = data[1];
                String university = data[2];
                String[] courses = data[3].split(";");
                Student student = new Student(student_id, stud_name, university, courses);
                students.put(student_id, student);
            }
        }
    }

        public static void printStudents () {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
}
