package pckg_03;

import java.util.Scanner;

public class MainApp {

    private static Scanner scanner;
    public static void main(String[] args) {
        
       // int res = AUX01.sumFirstNInt(10);
       // int res2 = AUX01.sumFirstNInt2(10);
       // System.out.println(res2);
       // AUX01 a1 = new AUX01("Karlo");
       // a1.setClassSpecName("ABC");
       // System.out.println(a1);    

       // Person pr1 = new Person("Petar", 21);
       // Student s1 = new Student("Petrica", 24);

       // pr1.tenYearsFromNow();
       // s1.tenYearsFromNow();
       // s1.passTheExam();
       //ilustrateSwitch("nesto");
       scanner = new Scanner(System.in);
       userDefinedInput();
    }

/*   private static void showArgs(String[] arguments) {
        for (String strg : arguments) {
            System.out.println(strg);
        }

        for(int k = 0; k < arguments.length; k++) {
            System.out.println(arguments[k]);
        }

    }
*/

/*     private static void ilustrateSwitch(String caseString) {
        System.out.println("Goto switch direct...");
        switch (caseString) {
            case "prvi": 
                System.out.println("Prvi izbor je odabran!"); break;

            case "drugi":
                System.out.println("Drugi je odabran!"); break;
            
            case "zadnji":
                System.out.println("Zadnji je izabran!"); break;
            default:
                System.out.println("Unexpected value: " + caseString);
        }
    }
*/
    
    private static void userDefinedInput() {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }


}

