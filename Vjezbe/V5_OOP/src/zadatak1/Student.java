package zadatak1;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class Student {

    // Atributi
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents;

    // Setter za enrolmentDate
    protected void setEnrolmentDate() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Set enrolment date for " + this.name + " as dd-MM-yyyy format!");
        String scDate = sc.nextLine();
        enrolmentDate = DATE_FORMAT.parse(scDate);
    }

    // Info
    protected void infoStudent(){
        System.out.println("Student name -> " + name + ", id -> " + idStudent);
        System.out.println("Student enrolment date -> " + enrolmentDate.toString());
    }

    // Definiramo metodu koju cemo koristiti kasnije preko drugih klasa
    protected abstract void completedStudy(int enrolmentDate);
}
