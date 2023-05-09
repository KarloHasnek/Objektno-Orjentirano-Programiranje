package zadatak1;
import java.text.ParseException;

public class Client {

    public static void main(String[] args) throws ParseException{
        DS_Student jurica = new DS_Student("Jurica");
        jurica.setEnrolmentDate();
        jurica.completedStudy(3);
        jurica.infoStudent();

        PDS_Student pero = new PDS_Student("Pero");
        pero.setEnrolmentDate();
        pero.completedStudy(4);
        pero.infoStudent();
    }
}